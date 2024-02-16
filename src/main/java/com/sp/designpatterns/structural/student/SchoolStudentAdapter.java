package com.sp.designpatterns.structural.student;

public class SchoolStudentAdapter implements Student {

    private SchoolStudent schoolStudent = null;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getFirstName() {
        return schoolStudent.getFirstName();
    }

    @Override
    public String getLastName() {
        return schoolStudent.getLastName();
    }
}
