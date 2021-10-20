package com.company;
//import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Jack", "Reacher", 1, 80, 1);
        Student s2 = new Student("Neil", "Armstrong", 2, 50);
        Student s3 = new Student(3, 70, 1);
        Student s4 = new Student("James", "Ryan", 4, 60, 2);
        Student s5 = new Student("Nicholas", "Cage", 5, 67, 1);
        Student s6 = new Student("John", "Woods", 6, 52, 2);

        s2.year = 2;
        s3.firstName = "William";
        s3.lastName = "Shatner";
        s1.printFullName();
        s2.printFullName();
        s3.printFullName();
        if (s1.isApproved()){
            s1.changeYearIfApproved();
        }
        else{
            System.out.println("Sorry. You need grade more than 60 to go to next year");
        }
        Courses c1 = new Courses("Physics", "Mr.Gregory", 1, new ArrayList<Student>());
        //enroll Student
        c1.enroll(s1);
        c1.enroll(s2);
        c1.enroll(s3);
        //remove student
        c1.unEnroll(s2);
        System.out.println("Student count: " + c1.countStudents());
        System.out.println("Best Grade: " + c1.bestGrade());
       // System.out.println(c1.studentList.get(1).firstName);
        Student[] arrOfStudent;
        arrOfStudent = new Student[]{s4, s5, s6};
        // Student[] arrOfStudent = {s4, s5, s6}; also correct

        //enroll Array of Student
        c1.enroll(arrOfStudent);
        Iterator<Student>i = c1.studentList.iterator();
        System.out.println("List of students in ArrayList:");
        while(i.hasNext()){
            System.out.println(i.next().firstName);
        }
       // sSystem.out.println(c1.countStudents());

        //Challenge yourself Qs - Calculate Avg grade
        float averageGrade;
        averageGrade = c1.calcAvgGrade();
        System.out.println("Average Grade: " + averageGrade);

        //rank students by grades
        c1.sortByGrade();
        //Student status above average or not
        c1.showAvgStatus(averageGrade);
       // Collections.sort(c1.studentList, new StudentsByGrade());
       // for (int i)
    }
}