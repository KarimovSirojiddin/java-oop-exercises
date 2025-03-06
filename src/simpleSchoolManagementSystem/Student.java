package simpleSchoolManagementSystem;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private double feesPaid;
    private double feesTotal;
    int counterOfStudents = 1;
    School school;

    {
        counterOfStudents++;
    }
    Student(int id, String firstName, String lastName, int grade, double feesTotal){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.feesTotal = feesTotal;
        counterOfStudents++;
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
        school.updateTotalMoneySpent(fees);
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
