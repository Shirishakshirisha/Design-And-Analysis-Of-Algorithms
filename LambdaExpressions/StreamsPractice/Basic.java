package StreamsPractice;
import java.util.*;
import java.util.stream.Collectors;

public class Basic {

    public static void main(String[] args) {
        

        // Q1. Convert a list to a stream and print all elements
        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // numbers.stream().forEach(n->System.out.println(n));
        numbers.stream().forEach(System.out::println);


        // Q2. Filter even numbers from a list and print them
        System.out.println("Even numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n-> System.out.println(n));

        // Q3. Map a list of numbers to their squares and print them
        System.out.println("Squares:");
        List<Integer> b = numbers.stream()
                .map(n -> n * n)
                .toList();
        // b.forEach(n -> System.out.println(n));

        System.out.println();
        List<Integer> c = numbers.stream().map(n->n*n*n).collect(Collectors.toList());
         c.forEach(n -> System.out.println(n));
        // for(int i=0; i<c.size(); i++){
        //     System.out.println(c.get(i));
        // }


        

    }
    
}
