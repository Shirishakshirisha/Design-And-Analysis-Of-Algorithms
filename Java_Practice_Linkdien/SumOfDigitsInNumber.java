

public class SumOfDigitsInNumber {
    public static void main(String[] args){
        int n = 7853476;
        int sum =0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.println("The sum of the numbers is " + sum);
    }
}
