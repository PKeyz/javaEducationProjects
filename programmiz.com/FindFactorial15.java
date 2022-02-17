//15
//find the factorial of a number using for and while loop in Java.

public class FindFactorial15 {
    public static void main (String[] args){
        /*
        int num = 5;
        long factorial = 1;

        for(int i = 1; i <= num ; i++){
            factorial *= i;
        }
        System.out.printf("The Factorial of %d = %d", num, factorial);
        */

        int num = 5;
        int factorial =1;
        int i = 1;

        while (i <= num){
            factorial *= i;
            i++;
        }
        System.out.printf("The factorial of %d is %d", num,factorial);
    }
}
