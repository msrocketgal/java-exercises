package org.launchcode.java.prep_exercises.school;

import java.util.HashMap;

/**
 * Created by msroc on 5/21/2017.
 */
public class Course {

    private String courseTitle;
    private static int courseID;
    private HashMap<Integer, Double> students;

    public Course(String courseTitle, int courseID){
        this.courseTitle = courseTitle;
        this.courseID = courseID;
        this.students = new HashMap<Integer, Double>();
    }

    public boolean equals(Object o){
        return ((Course)o).getCourseID() == this.getCourseID();
    }
/*
    public String toString() {
        int strStudents = "";
        for(int i = 0; i < this.students.size(); i++){
            Student sID =this.students.get(i);
            strStudents += sID.toString();
        }
        return "Course: " + this.courseTitle + " ID: " + this.courseID
                + "Students: " + strStudents;
    }
*/
    public String getCourseTitle(){
        return this.courseTitle;
    }

    private void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }

    public int getCourseID(){
        return this.courseID;
    }
}
