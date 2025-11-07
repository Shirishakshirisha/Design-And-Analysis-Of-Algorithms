package APICalls;

import java.net.HttpURLConnection;
import java.net.URL;

public class ApiPostExample {
    
    public static void main(String[] args) {
        try{
            // API endpoint
            URL url = new URL("https://api.company.com/submit");

            // Create connection
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();

            // set request method
            conn.setRequestMethod("POST");

            // Add headers
            conn.setRequestProperty("Content-Type","application/json");

            // Enable writing output
            conn.setDoOutput(true);

            String jsonInput = "{"
                +"\"name
                    
                    "}";
        }
    }
}
