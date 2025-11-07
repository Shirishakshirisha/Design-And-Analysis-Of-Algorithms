package FileHandlingMechanisms;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args)
    {
        System.out.println(" ");
       try{
         File file = new File("example3.txt");
         System.out.println(System.getProperty("user.dir"));
        if(file.createNewFile()){
            System.out.println("File created" + file.getName());
        }
       }catch(IOException e){
        System.out.println("An error while creating a file");
        e.printStackTrace();
       }
    }
    
}
