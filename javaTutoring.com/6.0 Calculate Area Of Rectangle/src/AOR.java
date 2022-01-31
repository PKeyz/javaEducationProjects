import java.util.Scanner;

public class AOR{

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the rectangle.");
        double height = sc.nextDouble();

        System.out.println("Enter the width of the rectangle.");
        double width = sc.nextDouble();

        double area = (height * width);

        System.out.println("The area of the rectangle is: " + area + " cm");

    }
}