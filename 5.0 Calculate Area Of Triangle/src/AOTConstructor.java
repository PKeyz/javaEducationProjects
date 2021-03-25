import java.util.Scanner;
class AOT{
    long area;
        AOT(long w, long h){
            area = (w*h)/2;
        }
}

public class AOTConstructor {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle: ");
        long w = sc.nextLong();
        System.out.println("Enter the Height of the Triangle: ");
        long h = sc.nextLong();

        AOT A1 = new AOT(w,h);

        System.out.println("Area of the Triangle is: "+ A1.area);
    }
}
