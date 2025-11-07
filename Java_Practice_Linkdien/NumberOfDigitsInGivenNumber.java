
public class NumberOfDigitsInGivenNumber {
    public static void main(String[] args){
        int n = 978575;
        int count =0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Total n umber of digits in the ggiven number is :" + count);
    }
}
