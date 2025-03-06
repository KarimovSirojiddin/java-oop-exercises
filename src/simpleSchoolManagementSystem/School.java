package simpleSchoolManagementSystem;

import java.util.Arrays;

public class School {
    private Teacher[] teachers = new Teacher[100];
    private Student[] students = new Student[100];
    private double totalMoneyEarned = 0;
    private double totalMoneySpent = 0;

    School(){

    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Student[] getStudents() {
        return students;
    }
     double getTotalMoneyEarned(){
        return totalMoneyEarned;
     }

    public void updateTotalMoneyEarned(double money) {
        this.totalMoneyEarned += money;
    }

    public void updateTotalMoneySpent(double money) {
        this.totalMoneySpent += money;
    }

    public void addTeacher(Teacher teacher) {
        if(teacher.counterOfTeachers < teachers.length){
            teachers[teacher.counterOfTeachers + 1] = teacher;
        }
    }
    public void addStudent(Student student) {
        if(student.counterOfStudents < students.length){
            students[student.counterOfStudents + 1] = student;
        }
    }
}



