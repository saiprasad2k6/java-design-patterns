package com.sp.designpatterns.structural.student;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();

        CollegeStudentAdapter collegeStudentAdapter = new CollegeStudentAdapter(new CollegeStudent("sai", "prasad"));
        SchoolStudentAdapter schoolStudentAdapter = new SchoolStudentAdapter(new SchoolStudent("ravi", "sharma"));

        students.add(schoolStudentAdapter);
        students.add(collegeStudentAdapter);

        students.forEach(student -> System.out.println(student.getFirstName() + " " + student.getLastName()));

    }
}
