package studentDatabaseApplication;

import java.util.ArrayList;
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

    private ArrayList<Student> studentArrayList;
    private Scanner scanner;



    public static void main(String[] args) {
        System.out.println("How many students should be added to the database? \nPlease enter a number.\n");

        StudentApplication studentApplication = new StudentApplication();
        studentApplication.addStudents();
    }
}
