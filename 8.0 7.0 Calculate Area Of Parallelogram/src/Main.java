import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the height: ");
        double h = sc.nextDouble();


        System.out.println("Enter the value of the width: ");
        double w = sc.nextDouble();

        Area ar = new Area(h,w);

        System.out.println("The area of the Parallelogram is : " + ar.calculateArea());
    }
}
