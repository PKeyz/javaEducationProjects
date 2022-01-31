import java.util.Scanner;

public class CalculateRemainder {
    public static void main (String args[]){
        double s;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the divident ");
        double a = sc.nextDouble();
        System.out.println("Enter the devider: ");
        double b = sc.nextDouble();

        for(s = a; s > b; s -= b);

        System.out.println("Remainder is:" + s);
    }
}
 