package APICalls;

import java.io.*;
import java.net.*;

public class Read_Url {
    public static void main(String[] args) {
        System.out.println();
        try {
            // Use the "file" protocol for local files
            URL url = new URL("file:///C:/Users/Admin/Desktop/Shirisha_K/Striver/example.txt");

            // Open a connection to the file
            URLConnection uc = url.openConnection();

            // Get input stream
            InputStream is = uc.getInputStream();

            int i;
            // Read each byte until end of file (-1)
            while ((i = is.read()) != -1) {
                System.out.print((char) i); // Print the character
            }

            // Close the stream
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
