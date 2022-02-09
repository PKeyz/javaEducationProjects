import java.util.Scanner;

public class EvenOdd 
{
    public static void main(String[] args) 
    {
       /*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 ==0 )
        {
            System.out.println(num + " is even!");
        }
        else
            System.out.println(num + "is odd"); 
            */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = sc.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);
    } 
}
