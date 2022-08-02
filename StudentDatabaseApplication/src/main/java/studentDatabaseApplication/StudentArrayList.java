package studentDatabaseApplication;

import java.util.ArrayList;

public class StudentArrayList {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public StudentArrayList() {

    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    public ArrayList<Student> setStudentArrayList(String studentName, int studentYear) {
        if (studentArrayList.size() == 0) {
            Student student = new Student(studentName, studentYear);
            studentArrayList.add(student);
        } else {
            for (Student student : studentArrayList) {
                if (((student.getStudentName().equals(studentName) && student.getStudentYear() == studentYear) && studentArrayList.contains(student))) {
                    System.out.println(studentName + "is already in the database.");
                    break;
                } else {
                    student = new Student(studentName, studentYear);
                    studentArrayList.add(student);
                    break;
                }
            }
        }
        return studentArrayList;
    }

    public void getStudentCoursesFromArrayList(String studentName, int studentYear) {
        for (Student student : studentArrayList) {
            if ((student.getStudentName().equals(studentName)) && (student.getStudentYear() == studentYear)) {
                System.out.println(student.getEnrolledList() + "\n");
            }
        }
    }

    public boolean isStudentInArrayList(String studentName, int studentYear) {
        Student student = new Student(studentName, studentYear);
        return studentArrayList.contains(student);
    }
    public void printStudents(){
        for(Student student : studentArrayList){
            System.out.println(student.getStudentName() + " " + student.getStudentRank() + " " + student.getStudentUUID());
        }
    }
    public Student getStudentFromArrayList(String studentName, int studentYear) {
        Student student = null;

        if (isStudentInArrayList(studentName, studentYear)) {
            student = new Student(studentName, studentYear);

        } else {
            System.out.println("There is no student with this name and year in the database.\nTry again.");
        }
        return student;
    }
}
