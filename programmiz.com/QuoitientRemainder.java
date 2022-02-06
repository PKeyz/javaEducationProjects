/*
    Number 5:

    compute quotient and remainder from the given dividend and divisor in Java.
*/


public class QuotientRemainder 
{
    public static void main(String[] args) 
    {
        int divident = 25, divisor = 4;

        int quotient = divident / divisor;
        int remainder = divident % divisor;

        System.out.println("Quotient = " + quotient );
        System.out.println("Remainder = " + remainder);
    }
}
