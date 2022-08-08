package studentDatabaseApplication;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class Student {
    private String studentFirstName;
    private String studentLastName;
    private int studentYear;
    private ArrayList<Optional<Courses>> enrolledList = new ArrayList<>();
    private ArrayList<String> enrolledListString = new ArrayList<>();
    private UUID studentUUID = null;
    private int balance = 0;
    private int tuition = 0;
    private static final int courseCost = 600;

    public Student(){
    }
    public Student(String studentFirstName,String studentLastName, int studentYear) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentYear = studentYear;
        this.studentUUID = UUID.randomUUID();
    }
    public void setEnrolledList(String courseName) {
        Optional<Courses> course = Courses.getCourse(courseName);
        if ( course.isPresent() && (!getEnrolledListString().contains(courseName)) && (!getEnrolledList().contains(course))) {

            enrolledList.add(course);
            enrolledListString.add(courseName);

            addTuition(courseCost);
        }
        else{
            System.out.println("The student is already enrolled in this course.");
        }
    }
    public void printStudentData(){
        System.out.println("First name: " + studentFirstName);
        System.out.println("Last name: " + studentLastName);
        System.out.println("Student rank: " + getStudentRank());
        System.out.println("Student UUID: " + studentUUID);
        System.out.println("Student balance: " + getBalance());
        System.out.println("Student tuition: " + getTuition());
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

    public void addBalance(int paymentIn) {
        this.balance += paymentIn;
    }
    public void reduceBalance(int paymentOut){
        this.balance -= paymentOut;
    }

    public int getTuition() {
        return tuition;
    }

    public void addTuition(int amountTuition) {
        this.tuition += amountTuition;
    }
    public void reduceTuition(int amountTuition) {
        this.tuition -= amountTuition;
    }

}
