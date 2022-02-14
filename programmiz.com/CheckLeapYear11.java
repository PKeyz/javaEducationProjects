// check if the given year is a leap year or not. This is checked using a if else statement.


public class CheckLeapYear11 {
    public static void main (String [] artgs){
        //year to be checked

        int year = 2024;
        boolean leap = false;

        //if the year is divided by 4
        if (year % 4 == 0) {
            
            //if the year is century
            if (year % 100 == 0) {

                //if year is divided by 400
                //then it is a leap year

                if (year % 400 == 0) {
                    leap = true;
                }
                else {
                    leap = false;
                }
            }
            //if the year is not century
            else {
                leap = true;
            }
        }
        else {
            leap = false;
        }

        if (leap) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}


//it seems that the logic for finding the leap year
// %4 %100 %400 is a common practice I've never seen before.