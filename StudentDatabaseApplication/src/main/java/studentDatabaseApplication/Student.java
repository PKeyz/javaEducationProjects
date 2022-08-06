package studentDatabaseApplication;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class Student {

    //private final ArrayList<String> courseList = new ArrayList<String>("History","Mathematics","Physics","English","");
    private String studentFirstName;
    private String studentLastName;
    private int studentYear;
    private ArrayList<Optional<Courses>> enrolledList = new ArrayList<Optional<Courses>>();
    private ArrayList<String> enrolledListString = new ArrayList<>();
    private UUID studentUUID = null;
    private int balance = 0;
    private int tuition = 0;

    public Student(){
    }
    public Student(String studentFirstName,String studentLastName, int studentYear) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentYear = studentYear;
        this.studentUUID = UUID.randomUUID();
    }
/*
if courses contains course && enrolledList !contains course -> enroll
 */
    public void setEnrolledList(String courseName) {
        Optional<Courses> course = Courses.getCourse(courseName);
        if ( course.isPresent() && (!getEnrolledListString().contains(courseName)) & (!getEnrolledListString().contains(courseName))) {

            enrolledList.add(course);
            enrolledListString.add(courseName);

            setBalance(balance - 600);
            setTuition(tuition + 600);
        }
        else{
            System.out.println("The student is already enrolled in this course.");
        }
    }
    public ArrayList <String> getEnrolledListString(){
        return enrolledListString;
    }
    public ArrayList<Optional<Courses>> getEnrolledList() {
        return enrolledList;
    }

    public UUID getStudentUUID() {
        return studentUUID;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public int getStudentYear() {
        return studentYear;
    }

    public String getStudentRank() {
        String studentRank = switch (studentYear) {
            case 1 -> "Freshmen";
            case 2 -> "Sophomore";
            case 3 -> "Senior";
            default -> "Wrong input.";
        };
        return studentRank;
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
