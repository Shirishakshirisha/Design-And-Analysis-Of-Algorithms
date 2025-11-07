

public class ReverseNumber {
    public static void main(String[]args){
        int n = 3432875;
        int result = 0;
        while(n>0){
        int remainder = n%10;
        n = n/10;
        result = result*10+remainder;
        }
        System.out.println("The reverse of a number is : " + result);
    }
}
