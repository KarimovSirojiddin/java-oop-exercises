package simpleSchoolManagementSystem;

public class Student {
    int id;
    String firstName;
    String lastName;
    int grade;
    double feesPaid;
    double feesTotal;
    School school;

    Student(int id, String firstName, String lastName, int grade, double feesTotal){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.feesTotal = feesTotal;
    }
    int getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }
    public double getRemainingFees() {
        return feesTotal - feesPaid;
    }
    void setGrade(int grade){
        this.grade = grade;
    }
    String getName(){
        return firstName + " " + lastName;
    }
    void pay(int fees){
        feesPaid += fees;
        feesTotal -= fees;
        school.totalMoneyEarned += fees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", grade = " + grade +
                ", feesPaid = " + feesPaid +
                ", feesTotal = " + feesTotal +
                ", school = " + school +
                '}';
    }
}
