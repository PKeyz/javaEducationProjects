import java.util.*;

interface AreaCal {
    void circle ();
}

class CalculateCircleAreaInterface implements AreaCal {
    double area;

    public void circle (double r){
        area = (22 * r * r) / 7 ;
    }

    public static void main (String args[]){
        CalculateCircleAreaInterface x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius:");

        double rad = sc.nextDouble();

        x = new CalculateCircleAreaInterface ();

        x.circle(rad);

        System.out.println("Area of Circle is:" + x.area);
    }
}