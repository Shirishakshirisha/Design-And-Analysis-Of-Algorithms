

public class PrimeNumber {
    public static void main(String[] args){
        int n=5;
        
            if(!isPrime(n)){
                System.out.println("The given number is not prime number");
            }else{
                System.out.println("the given number is prime number");
            }
        
    }
    public static boolean isPrime(int n){
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }

}
