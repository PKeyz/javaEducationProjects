/*
    find and display the ASCII value of a character in Java.
    This is done using type-casting and normal variable assignment operations.
*/

public class ASCIIValue
{
    public static void main(String[] args)
    {

        char ch = 'a';
        int ascii = ch;

        //cast char to int

        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + "is: " + ascii);
        System.out.println("The ASCII value of " + ch + "is: " + castAscii);
    }
}
