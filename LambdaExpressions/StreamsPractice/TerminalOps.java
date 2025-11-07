package StreamsPractice;
import java.util.*;
import java.util.stream.*;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();


        

        // 2. forEach
        // no orderd
        list.stream().forEach(x -> System.out.println(x));
        



        // 3.  reduce : combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());




        // 4. count



        // 5 anyMathch,allMathch, noneMatch
        boolean b = list.stream().anyMatch(x -> x%2 ==0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x>0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x<0);
        System.out.println(b2);



        // 6.  findFirst, findAny
       System.out.println(list.stream().findFirst().get());
       System.out.println(list.stream().findAny().get());



    //    7. toArray()

    Object[] array = Stream.of(1,2,3).toArray();


    // 8. min , max
    System.out.println( Stream.of(2,44,69).max((o1,o2)->o2 - o1));
    Stream.of(2,44,69).max(Comparator.naturalOrder());
     Stream.of(2,44,69).min(Comparator.naturalOrder());

     List<String> names = Arrays.asList("Shirisha", "Srushti", "Amrutha", "Supritha");

        // Streams cannot be used after a terminal operation has been called
        // So the below on e will give an exception
                            // Stream<String> stream = names.stream();
                            // stream.forEach(System.out::println);
                            // List<String> lists= stream.map(String :: toUpperCase).toList();



        // forEachOrderd
        // used during paralelStream

        // forEach
        List<Integer> numbers0 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("USing for Each");
        numbers0.parallelStream().forEach(System.out::println);
        System.out.println("USing for Each ordered");
        numbers0.parallelStream().forEachOrdered(System.out::println);



    }

}
