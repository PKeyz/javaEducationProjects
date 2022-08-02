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


/*
features needed further to perfect application:

1. add studentSecondName in Student and each class and constructor! / separate scanners for studentSecondName
2. add "see the course-list" feature
3. add "add courses" feature
4. switch(action) 2 : format the output as " Name: x \nFamily name: y \nStudent UUID : z "
5.
 */

public class Main {
    public static void main(String[] args) {

        StudentArrayList studentArrayList = new StudentArrayList();
        boolean isEntering = true;

        while(isEntering){
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n" +
                    "Welcome to the StudentDatabaseApplication\n" +
                    "Press a number for the action you want to take.\n" +
                    "Press 1 to add new students to the database.\n" +
                    "Press 2 to see all the students in the database.\n" +
                    "Press 3 to see the courses of a student.\n" +
                    "Press 4 to see the balance of a student.\n" +
                    "Press 5 to see the tuition fees of a student.\n" +
                    "Press 6 to see the status of a student.\n" +
                    "Press 7 to exit the application.\n" +
                    "Enter your option here: \n");

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
                    System.out.println("New students have been added.\n");
                    break;
                case 2:
                    studentArrayList.printStudents();
                    break;
                case 3:
                    System.out.println("Enter the name of the student.\n");
                    String studentName = scanner.nextLine();

                    System.out.println("Enter the year of study.\n");
                    int studentYear = scanner.nextInt();

                    studentArrayList.getStudentCoursesFromArrayList(studentName,studentYear);
                    break;
                case 4:
                    System.out.println("Enter the name of the student.\n");
                    studentName = scanner.nextLine();

                    System.out.println("Enter the year of study.\n");
                    studentYear = scanner.nextInt();

                    int currentStudentBalance = studentArrayList.getStudentFromArrayList(studentName,studentYear).getBalance();
                    System.out.println("The balance of the student is " + currentStudentBalance);
                    break;
                case 5:
                    System.out.println("Enter the name of the student.\n");
                    studentName = scanner.nextLine();

                    System.out.println("Enter the year of study.\n");
                    studentYear = scanner.nextInt();

                    int currentStudentTuition = studentArrayList.getStudentFromArrayList(studentName,studentYear).getTuition();
                    System.out.println("The balance of the student is " + currentStudentTuition);
                    break;
                case 6:
                    System.out.println("Enter the name of the student.\n");
                    studentName = scanner.nextLine();

                    System.out.println("Enter the year of study.\n");
                    studentYear = scanner.nextInt();
                    String currentStatus = studentArrayList.getStudentFromArrayList(studentName,studentYear).getStudentRank();

                    System.out.println("The status of the student is " + currentStatus +"\n");
                    break;
                case 7:
                    System.out.println("Thank you for visiting. You're now exiting the application");
                    isEntering = false;
                default:
                    System.out.println("Wrong input, please try again. If you want to exit the application press 6.\n");
                    break;
            }
        }
    }
}
