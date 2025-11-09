package Rakuten;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz {
    public static void main(String[] args) {
        System.out.println();
        String regex = "\\d+";
        String input = "abc12f34";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println(matcher.group() + " ");
        }
    }
    
}
