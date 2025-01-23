package renoldthomaslabs.CS0410.Assign1;

// Author: Renold Thomas
// Filename: ComputeArea.java
// Date: 09 January 2025 @ 10-10:50 AM
// Program to calculate the area of a circle given the radius

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;  // Declare radius
        double area;    // Declare area

        // Prompt user to enter a radius
        System.out.println("Enter a number for radius: ");
        radius = input.nextDouble();

        // Compute area
        area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
