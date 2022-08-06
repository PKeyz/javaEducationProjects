package studentDatabaseApplication;

import java.util.ArrayList;

public class StudentArrayList {
    private static ArrayList<Student> studentArrayList = new ArrayList<>();

    public StudentArrayList() {

    }

    public static void setStudentArrayList(String studentFirstName, String studentLastName, int studentYear) {
        if (studentArrayList.size() == 0) {
            Student student = new Student(studentFirstName,studentLastName, studentYear);
            studentArrayList.add(student);
        } else {
            for (Student student : studentArrayList) {
                if (((student.getStudentFirstName().equals(studentFirstName) && student.getStudentLastName().equals(studentLastName) && student.getStudentYear() == studentYear) && studentArrayList.contains(student))) {
                    System.out.println(studentFirstName + " " + studentLastName + "is already in the database.");
                    break;
                } else {
                    student = new Student(studentFirstName,studentLastName, studentYear);
                    studentArrayList.add(student);
                    break;
                }
            }
        }
    }

    public ArrayList<Student> getStudentArrayList(){
        return this.studentArrayList;
    }

    public void getStudentCoursesFromArrayList(String studentFirstName,String studentLastName, int studentYear) {
        for (Student student : studentArrayList) {
            if (((student.getStudentFirstName().equals(studentFirstName) && student.getStudentLastName().equals(studentLastName) && student.getStudentYear() == studentYear) && studentArrayList.contains(student))) {
                System.out.println(student.getEnrolledList() + "\n");
            }
        }
    }

    public boolean isStudentInArrayList(String studentFirstName,String studentLastName, int studentYear) {

        for (Student student : studentArrayList) {
            if (student.getStudentFirstName().equals(studentFirstName) && student.getStudentLastName().equals(studentLastName) && student.getStudentYear() == studentYear) {
                return true;
            } else {
                return false;
            }
        }
        return Boolean.parseBoolean(null);
    }
    public void printStudents(){
        for(Student student : studentArrayList){
            System.out.println(student.getStudentFirstName() + " " + student.getStudentLastName() + " " + student.getStudentRank() + " " + student.getStudentUUID());
        }
    }
    public Student getStudentFromArrayList (String studentFirstName,String studentLastName, int studentYear) {
        Student student1 = null;
        for(Student student : studentArrayList){
            if (student.getStudentFirstName().equals(studentFirstName) && student.getStudentLastName().equals(studentLastName) && student.getStudentYear() == studentYear) {
                student1 = student;
                return student1;
            }
        }
        System.out.println("There is no such student in the database");
        return null;
    }

    public int seeListSize(){
        return studentArrayList.size();
    }
}
