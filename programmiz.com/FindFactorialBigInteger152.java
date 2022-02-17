import java.math.BigInteger;

public class FindFactorialBigInteger152 {
    public static void main (String[] args){
        int num = 30;
        BigInteger factorial = BigInteger.ONE;

        for (int i =1; i <= num; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d is %d", num,factorial);
    }
}

//never heard of BigInteger before , very interesting that there are even heavier elements than longs