// Renold Thomas
// SumSeries.java
// 30 January 2025 @ 10-10:50 AM
// Program to calculate the volume or surface area of a sphere/closed cylinder

package renoldthomaslabs.CS0410.Assign4;

import java.util.Scanner;

public class SphereCylinder {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double volume;
        double surfaceArea;
        double answer;
        double radius;
        double height;
        int shape;
        int calculation;

        // Get inputs from user
        System.out.print("Choose shape: Sphere (1), Cylinder (2).... ");
        shape = userInput.nextInt();

        System.out.print("Choose calculation: Volume (1), Surface Area (2).... ");
        calculation = userInput.nextInt();

        // Error handling for out of range values
        if (shape > 2) {
            System.out.println("Error: Invalid Number");
            return;
        }
        if (shape < 1) {
            System.out.println("Error: Invalid Number");
            return;
        }
        if (calculation > 2) {
            System.out.println("Error: Invalid Number");
            return;
        }
        if (calculation < 1) {
            System.out.println("Error: Invalid Number");
            return;
        }

        // Calculations and shape decisions
        // Sphere
        if (shape == 1) {
            System.out.print("Enter radius.... ");
            radius = userInput.nextDouble();
            // Volume
            if (calculation == 1) {
                answer = (4 / (double)3) * Math.PI * Math.pow(radius, 3);
            }
            // Surface Area
            else {
                answer = 4 * Math.PI * Math.pow(radius, 2);
            }
        }
        // Cylinder
        else {
            System.out.print("Enter radius.... ");
            radius = userInput.nextDouble();
            
            System.out.print("Enter height.... ");
            height = userInput.nextDouble();
            // Volume
            if (calculation == 1) {
                answer = Math.PI * Math.pow(radius, 2) * height;
            }
            // Surface Area
            else {
                answer = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
            }
        }
        System.out.printf("Answer = %.4f", answer);
    }
}