

public class GivenNumberIsPalindromeOrNot {

    public static void main(String[]args){
        int n = 323;
        int s = n;
        int result = 0;
        while(n>0){
        int remainder = n%10;
        n = n/10;
        result = result*10+remainder;
        }
        
        System.out.println("The reversed number is " + result);
        System.out.println("");
        if(s==result){
             System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("the given number is not a palindrome");
        }
       
    }


}
