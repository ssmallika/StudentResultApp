
package com.college.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
        } else {
            StudentResult student =
                new StudentResult(name, marks);

            student.displayResult();
        }

        sc.close();
    }
}
