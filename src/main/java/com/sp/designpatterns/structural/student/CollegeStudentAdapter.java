package com.sp.designpatterns.structural.student;

public class CollegeStudentAdapter implements Student{
    private CollegeStudent collegeStudent;

    public CollegeStudentAdapter(CollegeStudent collegeStudent) {
        this.collegeStudent = collegeStudent;
    }

    @Override
    public String getFirstName() {
        return collegeStudent.getfName();
    }

    @Override
    public String getLastName() {
        return collegeStudent.getlName();
    }
}
