package com.example;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[10];
        char[] grades = new char[10];

        System.out.println("Enter the marks of 10 students:");

        // Get marks for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            grades[i] = calculateGrade(marks[i]);
        }

        System.out.println("\nGrades for each student:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + " - Marks: " + marks[i] + ", Grade: " + grades[i]);
        }

        scanner.close();
    }

    // Function to calculate grade
    private static char calculateGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }
}
