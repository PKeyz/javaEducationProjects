//lecture 8


//check whether an alphabet is a vowel or a consotant using 
//if..else and switch statement in Java.

class CheckVowelConsonant {

    /*

    public static void main(String[] args) {

        char ch = 'k';

        if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ) {
            System.out.println("ch " + " is a vowel");
        }
        else{
            System.out.println(ch + " is a consonant");
        }
    }
}

*/

//with switch statements


    public static void main(String[] args) 
    {
        
        char ch = 'u';

        switch(ch) 
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is a consonant");
        }
    }
}