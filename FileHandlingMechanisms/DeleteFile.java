package FileHandlingMechanisms;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        System.out.println();
        File file = new File("example2.txt");
        if(file.delete()){
            System.out.println("Deleted file:" + file.getName());
        }else{
            System.out.println("Failed to delete file :");
        }
    }
}
