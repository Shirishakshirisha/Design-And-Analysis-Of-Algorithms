package StreamsPractice;
import java.util.*;

public class EngineeringDigest {
    public static void main(String[] args){
        System.out.println();



         // Summing values
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
         // int res = numbers.stream().reduce((x,y)->x+y).get();
        int res = numbers.stream().reduce(Integer::sum).get();
        System.out.println(res);


        // // Counting occurance of character
        String sentence = "Hello world!";
        //                                     // char[] toCharArray = sentence.toCharArray();
        //                                     // Arrays.stream()
         System.out.println(sentence.chars().filter(x -> x=='l').count());





        // statefull and stateless operations
        // 1 stateless
        List<Integer> numbers1 = Arrays.asList(5,2,9,1,6);
        System.out.println(numbers1.stream().map(x->x+x).toList());

        // 2. statefull
        // sorted
        // disting
        // some of the intermediate operations


        


        // Lazy Evaluations

        // 7.  






    }

}
