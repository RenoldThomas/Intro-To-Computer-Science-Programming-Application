// Renold Thomas
// Pyramid.java
// 20 March 2025 @ 10-10:50 AM
// Program to calculate the volume and surface area of a square pyramid.

package renoldthomaslabs.CS0410.Assign9;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width, height;
        
        System.out.print("Enter the width of the pyramid: ");
        width = input.nextDouble();

        System.out.print("Enter the height of the pyramid: ");
        height = input.nextDouble();

        display(width, height);
        while (true) {
            System.out.print("Do you want to calculate again? (Y/N): ");
            if (input.next().equalsIgnoreCase("Y")) {
                System.out.print("Enter the width of the pyramid: ");
                width = input.nextDouble();

                System.out.print("Enter the height of the pyramid: ");
                height = input.nextDouble();

                display(width, height);
            } else {
                System.out.println("Exiting...");
                break;
            }
            
        }
    }

    public static double volPyr(double width, double height) {
        return (1.0 / 3.0) * Math.pow(width, 2) * height;
    }

    public static double surfaceAreaPyr(double width, double height) {
        return Math.pow(width, 2) + 2 * width * Math.sqrt(Math.pow((width / 2), 2) + Math.pow(height, 2));
    }

    public static void display(double width, double height) {
        System.out.printf("Volume of the pyramid: %.4f%n", volPyr(width, height));
        System.out.printf("Surface area of the pyramid: %.4f%n", surfaceAreaPyr(width, height));
    }
}