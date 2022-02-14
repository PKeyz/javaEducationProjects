//13
//check whether a given character is an alphabet or not. 
//This is done using an if else statement or a ternary operator in Java.
public class CheckAlphabet13 {
    public static void main (String[] args){
        char c = '*';

        if ( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is in alphabet");
        }
        else {
            System.out.println(c + " not in alphabet");
        }
    }
}