
package Functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Function1 {
    public static void main(String[] args){
        // Function<Integer, Integer> doubleIt = x-> 2*x;
        // Function<Integer, Integer> tripleIt = x-> 3*x;
        // System.out.println();
        // System.out.println(doubleIt.andThen(tripleIt).apply(20));
        //  System.out.println(tripleIt.andThen(doubleIt).apply(20));
        // System.out.println(doubleIt.apply(100));
        // int a = doubleIt.apply(100);
        // System.out.println(a);



       System.out.println();
        // Function<Integer, Integer> identity = Function.identity();
        // Integer res2 = identity.apply(5);
        // System.out.println(res2);




        BiFunction<String, String, Integer> biFunction = (x,y)->(x+y).length();
        System.out.println(biFunction.apply("a", "bc"));

    }

}
