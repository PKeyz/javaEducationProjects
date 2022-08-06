package studentDatabaseApplication;

import java.util.*;

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

 --------:

features needed further to perfect application:

1. add studentSecondName in Student and each class and constructor! / separate scanners for studentSecondName
2. add "see the course-list" feature
3. add "add courses" feature
4. switch(action) 2 : format the output as " Name: x \nFamily name: y \nStudent UUID : z "
5. work out the exceptions! got to catch them all!
 */

public class Main {
    public static void main(String[] args) {

        StudentArrayList studentArrayList = new StudentArrayList();
        boolean isEntering = true;

        while(isEntering){
            Scanner scanner = new Scanner(System.in);

            System.out.println("""
                    Welcome to the StudentDatabaseApplication.
                    
                    Press a number for the action you want to take:
                    Press 1 to add new students to the database.
                    Press 2 to see all the students in the database.
                    Press 3 to enroll a student into a course.
                    Press 4 to see the courses of a student.
                    //Press x to set balance of the student.
                    Press 5 to see the balance of a student.
                    //Press 6 to increase the balance of a student.
                    Press 6 to see the tuition fees of a student.
                    Press 7 to see the status of a student.
                    Press 8 to exit the application.
                    Enter your option here:""");


            int action = scanner.nextInt();

            switch (action){
                case 1:
                    System.out.println("How many students should be added to the database? \nPlease enter a number.");
                    int amountStudentsAdded = scanner.nextInt();
                    System.out.println(amountStudentsAdded + " students will be added to the database.");

                    for (int i = 0; i < amountStudentsAdded; i++){
                        System.out.println("Enter the first name of the student.");
                        String studentFirstName = scanner.next();
                        System.out.println("Enter the last name of the student.");
                        String studentLastName = scanner.next();
                        System.out.println("Enter the year of study as a number:\nFreshman: 1\nSophomore: 2\nSenior: 3");
                        int studentYear = scanner.nextInt();

                        StudentArrayList.setStudentArrayList(studentFirstName,studentLastName,studentYear);
                    }
                    System.out.println("New students have been added.\n");
                    break;
                case 2:
                    if(studentArrayList.seeListSize() == 0){
                        System.out.println("Student database is empty");
                    }
                    else{
                        studentArrayList.printStudents();
                    }
                    break;
                case 3:
                    System.out.println("Enter the first name of the student.");
                    String studentFirstName = scanner.next();

                    System.out.println("Enter the last name of the student.");
                    String studentLastName = scanner.next();

                    System.out.println("Enter the year of study.");
                    int studentYear = scanner.nextInt();

                    if(studentArrayList.isStudentInArrayList(studentFirstName,studentLastName,studentYear)){
                        Student student = studentArrayList.getStudentFromArrayList(studentFirstName,studentLastName,studentYear);

                        System.out.println("This is the list of possible courses to choose from, please enter the title of one course name to assign in.\nEach application costs 600$, your balance will be adjusted accordingly.\n\n" + Courses.HISTORY101.getName()+"\n"+Courses.MATHEMATICS101.getName()+"\n"+Courses.PHYSICS101.getName()+"\n"+Courses.ENGLISH101.getName()+"\n"+Courses.CHEMISTRY101.getName()+"\n"+Courses.COMPUTERSCIENCE101.getName());

                        System.out.println("Should student " + studentFirstName + " " + studentLastName + " be enrolled in one of these courses? \nPlease enter 1 for YES and 2 for NO");
                        int courseEnrollmentChoice = scanner.nextInt();

                        if(courseEnrollmentChoice == 0){
                            break;
                        }
                        else {
                            System.out.println("Enter the name of the course here: ");
                            String courseName = scanner.next();
                            student.setEnrolledList(courseName);
                            System.out.println(studentFirstName + " " + studentLastName + " was enrolled into " + courseName);
                        }
                    }
                    else{
                        System.out.println("Wrong student data, try again.");
                    }
                    break;
                case 4:
                    System.out.println("Enter the first name of the student.");
                    studentFirstName = scanner.next();
                    System.out.println("Enter the last name of the student.");
                    studentLastName = scanner.next();
                    System.out.println("Enter the year of study.");
                    studentYear = scanner.nextInt();

                    System.out.println(studentArrayList.getStudentFromArrayList(studentFirstName,studentLastName,studentYear).getEnrolledListString());
                    break;
                case 5:
                    System.out.println("Enter the first name of the student.");
                    studentFirstName = scanner.next();
                    System.out.println("Enter the last name of the student.");
                    studentLastName = scanner.next();

                    System.out.println("Enter the year of study.");
                    studentYear = scanner.nextInt();

                    int currentStudentBalance = studentArrayList.getStudentFromArrayList(studentFirstName,studentLastName,studentYear).getBalance();
                    System.out.println("The balance of the student is " + currentStudentBalance);
                    break;
                case 6:
                    System.out.println("Enter the first name of the student.");
                    studentFirstName = scanner.next();
                    System.out.println("Enter the last name of the student.");
                    studentLastName = scanner.next();

                    System.out.println("Enter the year of study.");
                    studentYear = scanner.nextInt();

                    int currentStudentTuition = studentArrayList.getStudentFromArrayList(studentFirstName,studentLastName,studentYear).getTuition();
                    System.out.println("The balance of the student is " + currentStudentTuition);
                    break;
                case 7:
                    System.out.println("Enter the first name of the student.");
                    studentFirstName = scanner.next();
                    System.out.println("Enter the last name of the student.");
                    studentLastName = scanner.next();

                    System.out.println("Enter the year of study.");
                    studentYear = scanner.nextInt();
                    String currentStatus = studentArrayList.getStudentFromArrayList(studentFirstName,studentLastName,studentYear).getStudentRank();

                    System.out.println("The status of the student is " + currentStatus +"\n");
                    break;
                case 8:
                    System.out.println("Thank you for visiting. You're now exiting the application");
                    isEntering = false;
                default:
                    System.out.println("Wrong input, please try again. If you want to exit the application press 6.\n");
                    break;
            }
        }
    }
}
