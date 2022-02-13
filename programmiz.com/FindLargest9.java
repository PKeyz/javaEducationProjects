//9
// find the largest among three numbers using if else and nested if..else statement in Java.
import java.util.Scanner;

public class FindLargest9
{
    public static void main (String[] args){

        double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        if (n1 >= n2 && n1 >= n3){
            System.out.println(n1 + " is the largest number");
        }
        if (n2 >= n1 && n2 >= n3){
            System.out.println(n2 + " is the largest number");
        }
        else{
            System.out.println(n3 + " is the largest number");
        }
    }
}
