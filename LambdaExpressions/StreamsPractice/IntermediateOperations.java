package StreamsPractice;
import java.util.*;
import java.util.stream.*;

public class IntermediateOperations {
    public static void main(String[] args){
        // 1 filter
        List<String> list = Arrays.asList("Akshitha","ram","Shyam","Akshit");
        Stream<String> filteredstream = list.stream().filter(x -> x.startsWith("A"));
        // No filtering at this point
        long res = list.stream().filter(x->x.startsWith("A")).count();
        System.out.println(res);


        // 2 map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);


        // 3 sorted
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a,b)->a.length()-b.length());



        // 4 distinct
        System.out.println(list.stream().filter(x->x.startsWith("A")).distinct().count());


        // 5 limit
        System.out.println(Stream.iterate(1,x->x+1).limit(100).count());



        // 6 skip
        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).count());



        // 7 peek
        // performs an action on each element as it is consumed
        Stream.iterate(1, x->x+1).skip(10).limit(100).peek(System.out::println).count();



        // 8.  flatMap
        // Handels s treams of collections, lists, or arrays where each elements is itself a collection
        // Flatten nested structure (e.g., Lists within the lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time

        List<List<String>> ll = Arrays.asList(
                    Arrays.asList("apple","banana"),
                    Arrays.asList("orange","kiwi"),
                    Arrays.asList("pear","grapes")
        );
        System.out.println(ll.get(1).get(1));

        System.out.println(ll.stream().flatMap(x -> x.stream()).map(String :: toUpperCase).toList());
        List<String> sent = Arrays.asList(
                "hello worl!",
                "Java streams are powerfull",
                "flatMap is useful"  
        );

        System.out.println(sent.stream().flatMap(x -> Arrays.stream(x.split(" "))).map(String :: toUpperCase).toList());
        

    }

}
