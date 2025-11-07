

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int ans =0;
        while(n>0){
            int remainder= 153%10;
            // int r = (int)Math.pow(remainder , 3);
            int r = remainder * remainder * remainder;
            ans+=r;
            n=n/10;
        }
        if(n==ans){
            System.out.println("The given number is armstrong number");
        }
        else{
             System.out.println("The given number is not an armstrong number");
        }
    }

}
