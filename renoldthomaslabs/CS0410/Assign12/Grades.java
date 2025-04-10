// Renold Thomas
// Grades.java
// 10 April 2025 @ 10-10:50 AM
// Program to calculate grades given inputs of name and 2 exam scores.
// Also allows user to make edits before printing final grades.

package renoldthomaslabs.CS0410.Assign12;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        String[] names = new String[5];
        int[] exam1Scores = new int[5];
        int[] exam2Scores = new int[5];
        Scanner input = new Scanner(System.in);

        askForInputs(input, names, exam1Scores, exam2Scores);
        displayCurrentScores(input, names, exam1Scores, exam2Scores);
        printFinalGrades(names, exam1Scores, exam2Scores);
        input.close();

    }

    public static void askForInputs(Scanner input, String[] names, int[] exam1Scores, int[] exam2Scores) {
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = input.nextLine();
            System.out.print("Enter the scores for both exams: ");
            String[] scores = input.nextLine().split(" ");
            exam1Scores[i] = Integer.parseInt(scores[0]);
            exam2Scores[i] = Integer.parseInt(scores[1]);
            System.out.println();
        }
    }

    public static void displayCurrentScores(Scanner input, String[] names, int[] exam1Scores, int[] exam2Scores) {
        System.out.println(String.format("%-3s %-15s %-7s %-7s", "#", "Name", "Exam 1", "Exam 2"));
        System.out.println("===================================");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-3d %-15s %-7d %-7d%n", i + 1, names[i], exam1Scores[i], exam2Scores[i]);
        }

        System.out.print("Want to make any edits? (Y/N) ");
        String edit = input.nextLine();

        while (edit.equalsIgnoreCase("Y")) {
            editScores(input, names, exam1Scores, exam2Scores);
            System.out.println(String.format("%-3s %-15s %-7s %-7s", "#", "Name", "Exam 1", "Exam 2"));
            System.out.println("===================================");
            for (int i = 0; i < names.length; i++) {
                System.out.printf("%-3d %-15s %-7d %-7d%n", i + 1, names[i], exam1Scores[i], exam2Scores[i]);
            }
            System.out.print("Want to make any more edits? (Y/N) ");
            edit = input.nextLine();
            System.out.println();
        }
    }

    public static void editScores(Scanner input, String[] names, int[] exam1Scores, int[] exam2Scores) {
        System.out.print("Enter the number of the student you want to edit: ");
        int studentNumber = input.nextInt() - 1;
        if (studentNumber < 0 || studentNumber >= names.length) {
            System.out.println("Invalid student number.");
            input.nextLine(); // Consume the newline character
            return;
        }
        System.out.print("Do you want to edit name (enter 0), exam 1 score (enter 1), or exam 2 score (enter 2)? ");
        int editChoice = input.nextInt();
        input.nextLine(); // Consume the newline character
        if (editChoice == 0) {
            System.out.print("Enter the new name: ");
            names[studentNumber] = input.nextLine();
        } else if (editChoice == 1) {
            System.out.print("Enter the new exam 1 score: ");
            exam1Scores[studentNumber] = input.nextInt();
        } else if (editChoice == 2) {
            System.out.print("Enter the new exam 2 score: ");
            exam2Scores[studentNumber] = input.nextInt();
        } else {
            System.out.println("Invalid choice.");
        }
        input.nextLine(); // Consume the newline character
    }

    public static void printFinalGrades(String[] names, int[] exam1Scores, int[] exam2Scores) {
        System.out.println("Final Grades:");
        System.out.println(String.format("%-3s %-15s %-7s %-7s %-9s %-6s", "#", "Name", "Exam 1", "Exam 2", "Average", "Grade"));
        System.out.println("===================================");
        for (int i = 0; i < names.length; i++) {
            double average = (exam1Scores[i] + exam2Scores[i]) / 2.0;
            long roundedAverage = Math.round(average);
            String grade;
            if (roundedAverage >= 90) {
                grade = "A";
            } else if (roundedAverage >= 80) {
                grade = "B";
            } else if (roundedAverage >= 70) {
                grade = "C";
            } else if (roundedAverage >= 60) {
                grade = "D"; 
            } else {
                grade = "F";
            }
            System.out.printf("%-3d %-15s %-7d %-7d %-9d %-6s%n", i + 1, names[i], exam1Scores[i], exam2Scores[i], roundedAverage, grade);
        }
    }
} 