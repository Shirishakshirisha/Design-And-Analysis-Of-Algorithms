// This is a functional interface whose functional method is test(Object).
// Type Parameters:
// the type of the input to the predicate
// Since:
// 1.8

//Predicate<Type>
//Predicate should have only one abstract method  test(T t)
//return type is boolean
//But  it can have default methods , static methods


import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x-> x%2==0; 
        boolean ans = isEven.test(5);
        System.out.println("The given number is even or odd " + " " + ans);


        // Other ways of using predicate
        Predicate<String> isWordStartsWithA = x -> x.startsWith("S");
        System.out.println("The given word starts with the given letter or not"+"  "+isWordStartsWithA.test("Shirisha"));



        //here we are performing operations on two predicates
        Predicate<String> isWordStartsWithS = x -> x.toLowerCase().startsWith("S");
        Predicate<String> isWordEndsWithA = x -> x.toLowerCase().endsWith("a");
        Predicate<String> and = isWordStartsWithS.and(isWordEndsWithA);
        System.out.println(and.test("SA"));




        BiPredicate<Integer, Integer> isSum = (x, y)->(x+y)%2==0;
        System.out.println(isSum.test(5,5 ));
        
    
    }

}
