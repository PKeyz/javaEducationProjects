AllExamples1


import java.util.Scanner;

public class HelloWorld
{
    public static void main (String[] args)
    {
        //Creates a reader instance which takes input from standart input - keyboard
        Scanner reader = new Scanner (System.in);
        System.out.print("Enter a number: ");

        //nextInt() reads the next Integer passed from the keyboard
        int number = reader.nextInt();

        //println() prints the line to the screen
        System.out.println("You entered: " + number);
    }
}


//https://www.programiz.com/java-programming/examples/print-integer