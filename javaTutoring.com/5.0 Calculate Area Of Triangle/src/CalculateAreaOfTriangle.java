import java.util.Scanner;

public class CalculateAreaOfTriangle {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle");
        double w = sc.nextDouble();

        System.out.println("Enter the height of the Triangle");
        double h = sc.nextDouble();

        //Area = ( Width*Height)/2

        double area = (w*h)/2;
        System.out.println("The Area of the Triangle is " + area);
    }
}



