/*
    Number 6:

     two techniques to swap two numbers in Java. The first one uses a temporary variable 
     for swapping, while the second one doesn't use any temporary variables.
*/

public class SwapNumbers
{
    public static void main(String[] args) {
        float first = 1.20f, second = 2.45f;

    System.out.println("--Before swap--");
    System.out.println("First Number = " + first);
    System.out.println("Second Number = " + second);

    //value of first is assigned to temporary
    float temporary = first;

    //value of second is assigned to first
    first = second;

    //value of temporary is assigned back to second
    second = temporary;

    System.out.println("--After swap--");
    System.out.println("First Number = " + first);
    System.out.println("Second Number = " + second);
    }
}