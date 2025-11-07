

public class FibonacciNumbers {
    public static void main(String[] args){
        int n =6;
        int a =  fib(n);
        System.out.println("The nth fibonacci number is :" + a);
        // To print all the fibonacci numbers up to n
            int f =0;
            int s=1;
        for(int i=0; i<n; i++){
            
            int t=f+s;
            System.out.println(t);
            f=s;
            s=t;
        }
    }
   private static int fib(int n){
    if(n==1 || n==0){
        return 1;
    }
    return fib(n-1) + fib(n-2);
   }


}
// 4                            3
// 3     2                      2    1
// 2 1   1  0                   1 0
// 0+1+1+2+3+5
