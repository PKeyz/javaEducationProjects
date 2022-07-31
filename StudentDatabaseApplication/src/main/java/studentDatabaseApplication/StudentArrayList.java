package studentDatabaseApplication;

import java.util.ArrayList;

 public class StudentArrayList {
    private ArrayList <Student> studentArrayList;
    //private Student student;

    public StudentArrayList(){
      //  this.student = student;
    }

    public void setStudentArrayList(String studentName, int studentYear){
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
     public ArrayList<Student> getStudentArrayList() {
         return studentArrayList;
     }

 }
