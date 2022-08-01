package studentDatabaseApplication;

import java.util.ArrayList;

public class StudentArrayList {
    private static ArrayList <Student> studentArrayList;
    public StudentArrayList(){

    }

    /*
     public void setStudentArrayList(String studentName, int studentYear) {
        if(studentArrayList == null){
            Student student = new Student(studentName,studentYear);
            studentArrayList.add(student);
        }
        else{
            for(Student student : studentArrayList){
                if((student.getStudentName().equals(studentName)) && (student.getStudentYear() == studentYear)){
                    System.out.println("This student is already in the database.");
                }
                else{
                    student = new Student(studentName,studentYear);
                    studentArrayList.add(student);
                }
            }
        }
    }
     */

    public void setStudentArrayList (String studentName, int studentYear){
        try {
            if(studentArrayList.size() != 0){
                for(Student student : studentArrayList){
                    if((student.getStudentName().equals(studentName)) && (student.getStudentYear() == studentYear)){
                        System.out.println("This student is already in the database.");
                    }
                    else{
                        student = new Student(studentName,studentYear);
                        studentArrayList.add(student);
                    }
                }
            }
            else{
                Student student = new Student(studentName,studentYear);
                studentArrayList.add(student);
            }
        }
        catch (NullPointerException e){
            Student student = new Student(studentName,studentYear);
            studentArrayList.add(student);
        }
    }
     public void getStudentCoursesFromArrayList(String studentName,int studentYear) {
         for(Student student : studentArrayList){
             if((student.getStudentName().equals(studentName)) && (student.getStudentYear() == studentYear)){
                 System.out.println(student.getEnrolledList() + "\n");
             }
         }
     }
     public boolean isStudentInArrayList(String studentName,int studentYear){
        Student student = new Student(studentName,studentYear);
         return studentArrayList.contains(student);
     }
    public Student getStudentFromArrayList(String studentName,int studentYear) {
        Student student = null;

        if (isStudentInArrayList(studentName, studentYear)) {
            student = new Student(studentName, studentYear);

        } else {
            System.out.println("There is no student with this name and year in the database.\nTry again.");
        }
        /*
            for(Student student : studentArrayList){
            if((student.getStudentName().equals(studentName)) && (student.getStudentYear() == studentYear)){
                System.out.println("You chose student: " + studentName + "\n");
                return student;
            }
            else {
                System.out.println("There is no student with this name and year in the database.\nTry again.");
            }
        }
         */

        return student;
    }

 }
