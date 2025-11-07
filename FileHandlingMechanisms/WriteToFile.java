package FileHandlingMechanisms;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException{
        System.out.println("  ");
        FileWriter w = new FileWriter("example.txt");
        w.write("This is the first time i am doing the file handling operations");
        w.close();
        System.out.println("Succesfully wrote to the file");

    }
}
