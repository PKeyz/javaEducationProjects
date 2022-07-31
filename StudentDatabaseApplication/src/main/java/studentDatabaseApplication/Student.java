package studentDatabaseApplication;

import java.util.ArrayList;
import java.util.UUID;

public class Student {


  /*
Scenario:

You are a Database administrator for a university and need to create an application to manage student enrollments and balance


App requirements:

- ask the user how many new students will be added to the database

(enters a number for a loop)

- user should be prompted to enter the:  name/year for each student (1.freshmen 2.sophomore 3. senior)

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

    private String studentName;
    private int studentYear;
    private String studentRank;
    private ArrayList <Courses> enrolledList;
    private UUID studentUUID;
    private int balance;
    private int tuition;

    public Student(String studentName, int studentYear){
        this.studentName = studentName;
        this.studentYear = studentYear;
        this.studentUUID = UUID.randomUUID();
    }

    public void setEnrolledList (String course){
        if(!enrolledList.contains(course) ){
            enrolledList.add(Courses.valueOf(course));

            getTuition();
            setBalance(balance - tuition);
        }
    }

    public ArrayList <Courses> getEnrolledList(){
        return enrolledList;
    }

    public UUID getStudentUUID(){
        return studentUUID;
    }

    /*
    public void setStudentRank (int studentYear){
        switch (studentYear){
            case 1:
                studentRank = "Freshman";
                break;
            case 2:
                studentRank = "Sophomore";
                break;
            case 3:
                studentRank = "Senior";
                break;
        }
    }
    */
    public int countTuition(){
        int amountCourses = getEnrolledList().size();
        int tuition = amountCourses * 600;
        return tuition;
    }

    public String getStudentRank(){
        return studentRank;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }
}
