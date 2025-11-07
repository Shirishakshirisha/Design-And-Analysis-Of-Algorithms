package Consumers;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args){
        // Consumer c = x->System.out.println(x);
        // c.accept(100);


        // List<Integer> list = Arrays.asList(1,2,3);
        // System.out.println("Using for each loop");
        // Consumer<List<Integer>> printList = x->{
        //     for(int i :x){
        //         System.out.println(i);
        //     }
        // };

        // printList.accept(list);



        BiConsumer<Integer , String> biConsumer = (x,y)->{
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept(1,"A");
        
        // Map<Integer,String> map = new HashMap<>();
        // map.put(1,"A");
        // map.put(2,"B"); 
        // map.put(3,"C");
        // map.put(4,"D");

        // BiConsumer<Integer,String> c = (id,name)->{
        //     System.out.println(id+name);
        // };
        //  map.forEach(c);
       




    }

}
