package org.launchcode.java.prep_exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by msroc on 5/10/2017.
 * HashMap: Make a program similar to GradebookHashMap, but which takes in students names and ID numbers (as integers)
 * instead of names and grades. In this case, however, the keys should be integers (the IDs) and the values should
 * be strings (the names). Modify the roster printing code accordingly.
 */
public class GradebookHashMap_2 {

    public static void main(String[] args) {

        HashMap<Integer, Double> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int newStudentID;

        System.out.println("Enter your students (or zero <0> to finish):");

        // Get student IDs and grades
        do {

            System.out.print("Student ID: ");
                newStudentID = in.nextInt();

            if (newStudentID != 0) {
                System.out.print("Grade: ");
                Double newGrade = in.nextDouble();
                students.put(newStudentID, newGrade);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(newStudentID != 0);

        // Print class roster
        double numStudents = students.size();
        if (numStudents == 0) {
            System.out.println("Error: Unable to produce class roster with no user input.");
        }else {
            System.out.println("\nCLASS ROSTER -");
            double sum = 0.0;

            for (Map.Entry<Integer, Double> student : students.entrySet()) {
                System.out.println("Student ID: " + student.getKey() + " (" + student.getValue() + ")");
                sum += student.getValue();
            }

            double avg = sum / students.size();
            System.out.println("Average grade: " + avg);
        }
    }
}
