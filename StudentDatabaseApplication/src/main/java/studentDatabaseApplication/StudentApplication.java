package studentDatabaseApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApplication {
    
    private ArrayList<Student> studentArrayList;
    private Scanner scanner;
    private int amountStudentsAdded;
    
    /*
    App requirements:

        - ask the user how many new students will be added to the database // ok
        
        (enters a number for a loop) //ok
        
        - user should be prompted to enter the:  name/year for each student (1.freshmen 2.sophomore 3. senior) // ok
        
        - student has a 5 digit UID ,  first num being their grade level // nope real UUID
        - student can enroll in classes:
        
        -History 101
        -Mathematics 101
        -Physics 101
        -English 101
        -Chemistry 101
        -Computer Science 101 // student setCourse ready
        
        - each course costs 600$ to enroll
        - student can view their balance & pay their tuition
        - to see status of student we should see their : name/id/courses/balance
      */
     
    public void addStudents(){
        Scanner scanner = new Scanner(System.in);
        amountStudentsAdded = scanner.nextInt();
        System.out.println(amountStudentsAdded + " students will be added to the database.\n");
        
        StudentArrayList studentArrayList = new StudentArrayList();
        
        for(int i = 0; i < amountStudentsAdded; i++){
            System.out.println("Enter the name of the student.\n");
            String studentName = scanner.nextLine();

            System.out.println("Enter the year of study.\n");
            int studentYear = scanner.nextInt();
            
            studentArrayList.setStudentArrayList(studentName,studentYear);
        }
    }
}
