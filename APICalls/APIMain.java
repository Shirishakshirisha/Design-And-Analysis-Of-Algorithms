package APICalls;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        // var url = "https://api.github.com/users/Shirishakshirisha";
        //  var url = "https://covid19.mathdro.io/api";
        // avve covid urlink giving error
        var url = "https://disease.sh/v3/covid-19/all";


        // Http Request
        var request =  HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        var client = HttpClient.newBuilder().build();
        var response = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println(response.statusCode());
    }
    
}
