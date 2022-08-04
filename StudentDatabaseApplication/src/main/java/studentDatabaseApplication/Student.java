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

    private String studentFirstName;
    private String studentLastName;
    private int studentYear;
    private ArrayList<Courses> enrolledList;
    private UUID studentUUID = null;
    private int balance;
    private int tuition;

    public Student(){
    }
    public Student(String studentFirstName,String studentLastName, int studentYear) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentYear = studentYear;
        this.studentUUID = UUID.randomUUID();
    }

    public void setEnrolledList(String course) {
        if (!enrolledList.contains(course)) {
            enrolledList.add(Courses.valueOf(course));

            getTuition();
            setBalance(balance - tuition);
        }
    }

    public ArrayList<Courses> getEnrolledList() {
        return enrolledList;
    }

    public UUID getStudentUUID() {
        return studentUUID;
    }

    public void countTuition() {
        int amountCourses = getEnrolledList().size();
        setTuition(amountCourses * 600);
    }
    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }
    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public String getStudentRank() {
        String studentRank = new String();
        switch (studentYear){
            case 1:
                studentRank = "Freshmen";
                break;
            case 2:
                studentRank = "Sophomore";
                break;
            case 3:
                studentRank = "Senior";
                break;
        }
        return studentRank;
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
