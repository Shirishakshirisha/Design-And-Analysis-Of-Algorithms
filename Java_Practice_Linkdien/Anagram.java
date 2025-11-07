
import java.util.*;
public class Anagram{
    public static void main(String[] args) {
       String str1 = "ABcd";
       String str2 = "dcba";
       boolean result = isAnagram(str1 , str2);
       System.out.println(result);
    }

    
    public static boolean isAnagram(String str1 , String str2){
        String str3 = str1.toLowerCase();
        String str4 = str2.toLowerCase();

        if(str3.length()!=str4.length())
        {
            return false;
        }
        else{
            char[] stra = str3.toCharArray();
            char[] strb = str4.toCharArray();
            System.out.println(stra);
           Arrays.sort(stra);
           Arrays.sort(strb);

            if(stra.equals(strb)){
                return true;
            }

            for(int i=0; i<stra.length; i++){
                if(stra[i]!=strb[i]){
                    return false;
                }

            }
        }
        return true;


    

    }
}