import java.util.Scanner;

public class Main {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value for side one:");
        double a = sc.nextDouble();

        System.out.println("Enter a value for side two:");
        double b = sc.nextDouble();

        Area iso = new Area(a,b);

        System.out.println("The area of the Triangle is: " + iso.area );

    }
}
