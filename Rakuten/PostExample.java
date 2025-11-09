package Rakuten;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class PostExample {
    
    public static void main(String[] args) throws Exception {
        String url = "https://jsonplaceholder.typicode.com/posts";
        String jsonData = """
            {
              "userId": 1,
              "title": "test title",
              "body": "test body"
            }
            """;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonData, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        String responseBody = postResponse.body();
        int idStart = responseBody.indexOf("\"id\":") + 5;
        int idEnd = responseBody.indexOf("}", idStart);
        String id = responseBody.substring(idStart, idEnd).trim();
        String urlWithId = url + "/" + id;

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(urlWithId))
                .GET()
                .build();
        HttpResponse<String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if (getResponse.statusCode() == 200) {
            String title = extractValue(getResponse.body(), "title");
            System.out.println(title);
        } else {
            System.out.println("Error");
        }
    }

    private static String extractValue(String json, String key) {
        String searchKey = "\"" + key + "\":";
        int start = json.indexOf(searchKey);
        if (start == -1) return null;
        start = json.indexOf("\"", start + searchKey.length()) + 1;
        int end = json.indexOf("\"", start);
        return json.substring(start, end);
    }
}