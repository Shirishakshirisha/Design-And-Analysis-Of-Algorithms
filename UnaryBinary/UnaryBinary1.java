package UnaryBinary;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinary1 {
    public static void main(String[] args) {
        UnaryOperator<Integer> a = x->2*x;
        BinaryOperator<Integer> b = (x,y) -> x+y;
    }

}
