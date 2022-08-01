package studentDatabaseApplication;

import java.util.Scanner;

/*
Scenario:

You are a Database administrator for a university and need to create an application to manage student enrollments and balance

App requirements:

- ask the user how many new students will be added to the database

(enters a number for a loop)

- user should be prompted to enter the:  name/year for each student (1.freshman 2.sophomore 3. senior)

- student has a 5 digit UID ,  first num being their grade level
- student can enroll in classes:

-History 101
-Mathematics 101
-Physics 101
-English 101
-Chemistry 101
-Computer Science 101

- each course costs 600$ to enroll
- student can view their balance & pay their tuition
- to see status of student we should see their : name/id/courses/balance
 */

public class Main {
    public static void main(String[] args) {

        StudentArrayList studentArrayList = new StudentArrayList();
        boolean isEntering = true;

        while(isEntering){
            Scanner scanner = new Scanner(System.in);
            //StudentArrayList studentArrayList = new StudentArrayList();

            System.out.println("\nWelcome to the StudentDatabaseApplication");
            System.out.println("Press a number for the action you want to take.\n");
            System.out.println("Press 1 to add new students to the database.");
            System.out.println("Press 2 to see the courses of a student.");
            System.out.println("Press 3 to see the balance of a student.");
            System.out.println("Press 4 to see the tuition fees of a student.");
            System.out.println("Press 5 to see the status of a student.");
            System.out.println("Press 6 to exit the application.");

            int action = scanner.nextInt();

            switch (action){
                case 1:
                    System.out.println("How many students should be added to the database? \nPlease enter a number.");
                    int amountStudentsAdded = scanner.nextInt();
                    System.out.println(amountStudentsAdded + " students will be added to the database.");

                    for (int i = 0; i < amountStudentsAdded; i++){
                        System.out.println("Enter the name of the student.");
                        String studentName = scanner.next();

                        System.out.println("Enter the year of study as a number:\nFreshman: 1\nSophomore: 2\nSenior: 3");
                        int studentYear = scanner.nextInt();

                        studentArrayList.setStudentArrayList(studentName,studentYear);
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the student.\n");
                    String studentName = scanner.nextLine();

                    System.out.println("Enter the year of study.\n");
                    int studentYear = scanner.nextInt();

                    studentArrayList.getStudentCoursesFromArrayList(studentName,studentYear);
                    break;
                case 3:
                    System.out.println("Enter the name of the student.\n");
                    studentName = scanner.nextLine();

                    System.out.println("Enter the year of study.\n");
                    studentYear = scanner.nextInt();

                    int currentStudentBalance = studentArrayList.getStudentFromArrayList(studentName,studentYear).getBalance();
                    System.out.println("The balance of the student is " + currentStudentBalance);
                    break;
                case 4:
                    System.out.println("Enter the name of the student.\n");
                    studentName = scanner.nextLine();

                    System.out.println("Enter the year of study.\n");
                    studentYear = scanner.nextInt();

                    int currentStudentTuition = studentArrayList.getStudentFromArrayList(studentName,studentYear).getTuition();
                    System.out.println("The balance of the student is " + currentStudentTuition);
                    break;
                case 5:
                    System.out.println("Enter the name of the student.\n");
                    studentName = scanner.nextLine();

                    System.out.println("Enter the year of study.\n");
                    studentYear = scanner.nextInt();
                    String currentStatus = studentArrayList.getStudentFromArrayList(studentName,studentYear).getStudentRank();

                    System.out.println("The status of the student is " + currentStatus +"\n");
                    break;
                case 6:
                    System.out.println("Thank you for visiting. You're now exiting the application");
                    isEntering = false;
                default:
                    System.out.println("Wrong input, please try again. If you want to exit the application press 6.\n");
                    break;
            }
        }
    }
}
