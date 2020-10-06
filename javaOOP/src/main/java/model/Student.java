package model;

public class Student {
    private String studentName;
    private int studentAge;
    private String studentGender;
    private int studentIdNo;

    public Student() {
        // Empty Constructor will set values in Main Class
    }

    // Getter and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public int getStudentIdNo() {
        return studentIdNo;
    }

    public void setStudentIdNo(int studentIdNo) {
        this.studentIdNo = studentIdNo;
    }
}
