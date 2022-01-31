import java.util.Scanner;

public class ValidPhoneNumFormat {

    public static void main(String[] args) {

        int[] scannedInt = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the phone number comverter. Please enter 10 digits one by one , then press ENTER");

        //iterates over array and saves scanned ints
        for (int i = 0; i < scannedInt.length; i++){
            scannedInt[i] = sc.nextInt();
        }

        System.out.println("You entered the following digits: ");

        for( int i = 0; i < scannedInt.length; i++){
            System.out.print(scannedInt[i] + ", ");
        }

        System.out.println("\n\nConvert format digits into phone format.\nFormat new number.\nEnter (1/2).");
        int inputChoice = sc.nextInt();

        switch (inputChoice){
            case 1:
                System.out.println("The Phone number format is: (+" + scannedInt[0] + scannedInt[1] + ") "+ scannedInt[2] + scannedInt[3] + scannedInt[4] +" - "+ scannedInt[5] + scannedInt[6] + scannedInt[7] + scannedInt[8] + scannedInt[9] );
                break;
            case 2:
                //copy paste of previous code / c&p recursion for a second chance.
                System.out.println("Welcome to the phone number comverter. Please enter 10 digits one by one , then press ENTER");
                //iterates over array and saves scanned ints
                for (int i = 0; i < scannedInt.length; i++){
                    scannedInt[i] = sc.nextInt();
                }
                System.out.println("You entered the following digits: ");
                for( int i = 0; i < scannedInt.length; i++){
                    System.out.print(scannedInt[i] + ", ");
                }
                System.out.println("The Phone number format is: (+" + scannedInt[0] + scannedInt[1] + ") "+ scannedInt[2] + scannedInt[3] + scannedInt[4] +" - "+ scannedInt[5] + scannedInt[6] + scannedInt[7] + scannedInt[8] + scannedInt[9] );
                break;
            default:
                System.out.println("Wrong number entered.\nPlease restart.");
                break;
        }

    }
    //Version: imperative

    /*

    4. create switch case to give options 1. convert Num to String 2. try with new nums
    5. create another scanner obj. for 4.
    1. needs to sc.nextInt()
    2. sc. input need to be 10 ints not less not more
    3. put ints in array [10] - makes it easier to convert [0]+[1] in (+[][]) braces

    1st make it imperative
    2nd make it OOP!

    example : Consider you entered the mobile number like 9 0 1 0 4 8 6 2 7 5,
    and it will convert more likely to be (+91) 9010-486275

     */

}
