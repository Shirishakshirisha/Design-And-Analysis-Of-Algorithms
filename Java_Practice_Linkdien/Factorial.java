
public class Factorial {
    public static void main(String[] args){
        int n=6;
        System.out.println("The factorial of a number is " + fact(n));
    } 
    private static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }

}
