package com.company;
import java.util.*;
import java.lang.*;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Student(String fname, String lname, int reg, int stuGrade, int stuYear){
        firstName = fname;
        lastName = lname;
        registration = reg;
        grade = stuGrade;
        year = stuYear;
    }
    public Student(String fname, String lname, int reg, int stuGrade){
        firstName = fname;
        lastName = lname;
        registration = reg;
        grade = stuGrade;
    }
    public Student(int reg, int stuGrade, int stuYear){
        registration = reg;
        grade = stuGrade;
        year = stuYear;
    }

    public void printFullName(){
        System.out.println("Student name is: " + firstName + " " + lastName);
    }

    public Boolean isApproved(){
        return (grade >= 60);
    }
    public void changeYearIfApproved(){
        System.out.println("Congratulations. You have moved on to year "+ (year +1));

    }
}
class StudentsByGrade implements Comparator<Student>{
    public int compare(Student a, Student b){
          return b.grade - a.grade;
    }
}