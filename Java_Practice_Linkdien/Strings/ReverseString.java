package Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

// public class ReverseString {
//         public static void main(String[] args){
//         String s = "hello";
//         char[] ch = s.toCharArray();//h,e,l,l,o
//         for(int i=0; i<ch.length/2; i++){
//             char temp =ch[i];
//             ch[i] = ch[ch.length-i-1];
//             ch[ch.length-i-1]=temp;
//         }
//         String a = new String(ch);
//         System.out.println("The reversed string is "+a);
//     }
// }


public class ReverseString {
    public static void main(String[] args){
        String s = "hello";
       // use a lambda-only stream reduction to build the reversed string
       String reversed = s.chars()
           .mapToObj(c -> String.valueOf((char) c))
           .reduce("", (acc, ch) -> ch + acc);
       System.out.println(reversed);
    }

}
