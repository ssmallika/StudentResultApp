
package com.college.student;

public class StudentResult {

    private String name;
    private int marks;

    public StudentResult(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade() {

        if (marks >= 90)
            return "S";

        else if (marks >= 80)
            return "B";

        else if (marks >= 70)
            return "C";

        else if (marks >= 60)
            return "D";

        else if (marks >= 40)
            return "E";

        else
            return "F";
    }

    public void displayResult() {
        System.out.println("Application Version: 2.0");
        System.out.println("\n----- STUDENT RESULT -----");
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + calculateGrade());

        if (marks >= 40)
            System.out.println("Result       : PASS");
        else
            System.out.println("Result       : FAIL");
    }
}
