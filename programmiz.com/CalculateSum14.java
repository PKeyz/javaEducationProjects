//14
// calculate the sum of natural numbers using for loop and while loop in Java.
//1 + 2 + 3 + ... + n
public class CalculateSum14 {
    public static void main (String[] args){
    /*
        int num = 100, sum = 0;

        for (int i = 0; i <= num; i++ ){
            sum+= i;
        }

        System.out.println(sum + " is the sum of the natural numbers.");
    }
    */

    int i = 0 , num = 50 , sum = 0;

    while (i <= num){
        sum += i;
        i++;
    }
    System.out.println(sum + " is the sum of the natural numbers.");
    }
}
