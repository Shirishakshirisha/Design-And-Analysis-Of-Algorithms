package FileHandlingMechanisms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) {
        try{
            File file = new File("example.txt");
            Scanner in = new Scanner(file);
            while(in.hasNextLine()){
                String line = in.nextLine();
                System.out.println(line);
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
