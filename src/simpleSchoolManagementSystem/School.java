package simpleSchoolManagementSystem;

public class School {
    int[] teachers = new int[100];
    int[] students = new int[100];
    double totalMoneyEarned = 0;
    double totalMoneySpent = 0;
    School(){

    }

    public int[] getTeachers() {
        return teachers;
    }

    public int[] getStudents() {
        return students;
    }
     double getTotalMoneyEarned(){
        return totalMoneyEarned;
     }
}



