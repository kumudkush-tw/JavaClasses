package com.company;
import java.util.*;
import java.lang.*;

public class Courses {
    String courseName;
    String professorName;
    int courseYear;
    ArrayList<Student> studentList = new ArrayList<Student>();

    public Courses(String cName, String profName, int cYear, ArrayList<Student> stuList){
        courseName = cName;
        professorName = profName;
        courseYear = cYear;
        studentList = stuList;
    }
    public void enroll(Student student){
        studentList.add(student);
    }
    public void enroll(Student[] students){
      for(int i=0; i < students.length; i++){
          studentList.add(students[i]);
      }
    }

    public void unEnroll(Student student){
        studentList.remove(student);
    }
    public int countStudents(){
        return studentList.size();
    }
    public int bestGrade(){
        int bestGrade = 0;
        for (Student student: studentList){
            if (student.grade > bestGrade){
                bestGrade = student.grade;
            }
        }
        return bestGrade;
    }

    public float calcAvgGrade(){
        float totGrade = 0;
        float avgGrade = 0;

        for (Student student: studentList){
            totGrade = totGrade + student.grade;
            System.out.println(totGrade);
        }
        avgGrade = totGrade/studentList.size();
        return avgGrade;
    }

    public void sortByGrade(){
        int j=0;
        Collections.sort(studentList, new StudentsByGrade());
        System.out.println("Ranking of students by Grade");
        for (Student student: studentList){
            j++;
            System.out.println( j + ". " + student.firstName + " " + student.lastName+ " " + student.grade);
        }

    }

    public void showAvgStatus(float courseAvg){
        for (Student student: studentList){
            if((float)student.grade > courseAvg) {
                System.out.println(student.firstName + " IS above course average of " + courseAvg);
            }
            else
                System.out.println(student.firstName + " is not above course average of " + courseAvg);

        }
    }
}