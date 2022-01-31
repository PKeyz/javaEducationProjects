import java.util.Scanner;

public class CalculateAreaOfCircle {

    public static void Main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double r = sc.nextDouble();
        double area = (22 * r * r ) / 7 ;
        System.out.println("The area of the circle is: " + area);
    }
}



