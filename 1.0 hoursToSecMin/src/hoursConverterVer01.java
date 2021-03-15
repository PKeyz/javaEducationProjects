import java.util.Scanner;

class hoursConverterVer01 {

    public static int hoursMinutes (int h) {
        int m;
        m = h * 60;
        return m;
    }
    public static int hoursSeconds (int h) {
        int s;
        s = h * 3600;
        return s;
    }

    public static void main(String[] args) {

        System.out.println("If you want to convert hours to minutes [Enter: 1],\nif want to convert hours to seconds. [Enter: 2]");

        Scanner sc = new Scanner(System.in);
        String scanned = sc.nextLine();
        int scannedInt = Integer.parseInt(scanned);

        System.out.println("Enter the amount of hours: ");
        int input = sc.nextInt();



        if(scannedInt == 1){
            hoursMinutes(input);
            System.out.println( input + " Hours is " + hoursMinutes(input) + " minutes.");

        }else if (scannedInt == 2){
            hoursSeconds(input);
            System.out.println(input + " Hours is " + hoursSeconds(input) + " seconds.");
        //}else if (scannedInt){
        //    System.out.println("You chose the wrong number, please restart!");
        // ERROR:     wrong order of operations:
            // if want to convert hours to seconds. [Enter: 2]
            //3
            //Enter the amount of hours:
            //2
            //You chose the wrong number, please restart!
            //Add feature;
        }



        System.out.println("\nDid you like it? Try again!\nIf there's new functionality you'd like to add - add it to the UPD.text");
    }
}