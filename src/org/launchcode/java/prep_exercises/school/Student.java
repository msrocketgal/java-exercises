package org.launchcode.java.prep_exercises.school;

/**
 * Created by msroc on 5/21/2017.
 */
public class Student {

    private static int nextStudentID = 1;
    private String name;
    private int studentID;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentID, int numberOfCredits, double gpa){
        this.name = name;
        this.studentID = studentID;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentID){
        this(name, studentID, 0, 0.0);
    }

    public Student(String name){
        this(name, nextStudentID, 0, 0.0);
        nextStudentID ++;
    }

    public void addGrade(int courseCredits, double grade){
        // Update the appropriate fields: numberOfCredits, gpa
        // gpa = (total quality score / (total number of credits)
        // quality score = (current gpa * current total number of credits)
        double currQualityScore = this.gpa * this.numberOfCredits;
        double newQualityScore = currQualityScore + (courseCredits * grade);
        this.numberOfCredits += courseCredits;
        this.gpa = newQualityScore / this.numberOfCredits;
    }

    public String getGradeLevel() {
        // Determine grade level of the student based on numberOfCredits
        // freshman (0-29 credits), sophomore (30-59 credits),
        // junior (60-89 credits), or senior (90+ credits).
        if (this.numberOfCredits > 89) {
            return "senior";
        } else if (this.numberOfCredits > 59) {
            return "junior";
        } else if (this.numberOfCredits > 29) {
            return "sophomore";
        } else {
            return "freshman";
        }
    }

    public boolean equals(Object o){
        return ((Student)o).getStudentId() == getStudentId();
    }

    public String toString() {
        return "Student: " + this.name + " ID: " + this.studentID + " (Credits: "
                + this.numberOfCredits + " GPA: " + this.gpa + ")";
    }

    public String getName() {
        return name;
    }

    private void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentID;
    }

    private void setStudentId(int aStudentId) {
        studentID = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double aGpa) {
        gpa = aGpa;
    }
}
