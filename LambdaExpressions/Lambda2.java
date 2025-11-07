public class Lambda2 {

    public static void main(String[] args) {
        //No error for this
        // MathOperations a = (x , y)->{ return x+y;};

        // If u r using the return statement {} is important or else it will trows an error
        // MathOperations a = (x , y) -> return x+y;


        // The below line will not give any error 
        // By removing an return keyword
        MathOperations a = (x , y) -> x+y;
       int b =  a.operate(3,4);
        System.out.println("Sum of the two values is " + " " + b);
    }
}



interface MathOperations{
    int operate(int a , int b);
}
