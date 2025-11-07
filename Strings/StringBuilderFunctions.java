package Strings;

public class StringBuilderFunctions {
    public static void main(String[] args){
        System.out.println(" ");
        String s = "Shirisha";
        StringBuilder sb = new StringBuilder(s);
        sb.append("Srushti");
        sb.insert(8, "k");
        // sb.yoString is creatingthe new String , not changing the original string
        s = sb.toString();
        System.out.println(s);  //the value of s = shirishaksrushti not shirisha
        // Even if the strings are immutable in java
        //  the original string(s) is not changed 
        //  instead anothe new String is created and added to s
        sb.reverse();
        System.out.println(sb);
        String a = sb.toString();
        System.out.println(sb);
        System.out.println();

        
    }
}
