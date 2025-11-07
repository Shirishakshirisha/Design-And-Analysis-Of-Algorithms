package Supplier;

import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {
        Supplier<String> g = ()-> "Hello World";
       System.out.println( g.get());
    }

}
