

public class SwapTwoNumbersWithoutUsingThirdvariable {
    public static void main(String[] args){
        int a =10;
        int b = 30;
        System.out.println("Before swapping the variables the value of a and b are :" + "a = " + a + "     b = " + b);
        a = a+b; //40
        b=a-b;   //10
        a = a-b; //30
        System.out.println("After swapping the variables the value of a and b are :" + "a = " + a + "     b = " + b);
    }
}
