// Renold Thomas
// Shapes.java
// 27 March 2025 @ 10-10:50 AM
// Program to calculate desired properties of a a desired shape.

package renoldthomaslabs.CS0410.Assign10;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double base, height, length, width;
        base = 0;
        height = 0;
        length = 0;
        width = 0;

        while (true) {
            System.out.println("1. Calculate hypotenuse of a right triangle");
            System.out.println("2. Calculate area of a right triangle");
            System.out.println("3. Calculate perimeter of a right triangle");
            System.out.println("4. Calculate area of a rectangle");
            System.out.println("5. Calculate perimeter of a rectangle");
            System.out.println("6. Calculate length of diagonal of a rectangle");
            System.out.println("7. Calculate area of a square");
            System.out.println("8. Calculate perimeter of a square");
            System.out.println("9. Calculate length of diagonal of a square");
            System.out.println("10. Exit");
            System.out.println("Choose a number 1-10 to select calculation: ");
            choice = sc.nextInt();
            System.out.println();

            if (choice == 10)
                break;
            // else if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice
            // == 5 || choice == 6 || choice == 7 || choice == 8 || choice == 9) {
            else {
                switch (choice) {
                    case 1: // Calculate hypotenuse of a right triangle
                        while (base <= 0 || height <= 0) {
                            System.out.println("Enter the base of the right triangle: ");
                            base = sc.nextDouble();
                            System.out.println("Enter the height of the right triangle: ");
                            height = sc.nextDouble();
                            if (base <= 0 || height <= 0) {
                                System.out.println("Invalid input. Please enter a positive number.");
                            } else {
                                System.out.println(
                                        "The hypotenuse of the right triangle is: " + hypotenuse(base, height) + "\n");
                                base = 0;
                                height = 0;
                                break;
                            }
                        }
                        break;
                    case 2: // Calculate area of a right triangle
                        while (base <= 0 || height <= 0) {
                            System.out.println("Enter the base of the right triangle: ");
                            base = sc.nextDouble();
                            System.out.println("Enter the height of the right triangle: ");
                            height = sc.nextDouble();
                            if (base <= 0 || height <= 0) {
                                System.out.println("Invalid input. Please enter a positive number.");
                            } else {
                                System.out.println(
                                        "The area of the right triangle is: " + areaOfTriangle(base, height) + "\n");
                                base = 0;
                                height = 0;
                                break;
                            }
                        }
                        break;
                    case 3: // Calculate perimeter of a right triangle
                        while (base <= 0 || height <= 0) {
                            System.out.println("Enter the base of the right triangle: ");
                            base = sc.nextDouble();
                            System.out.println("Enter the height of the right triangle: ");
                            height = sc.nextDouble();
                            if (base <= 0 || height <= 0) {
                                System.out.println("Invalid input. Please enter a positive number.");
                            } else {
                                System.out.println("The perimeter of the right triangle is: "
                                        + perimeterOfTriangle(base, height) + "\n");
                                base = 0;
                                height = 0;
                                break;
                            }
                        }
                        break;
                    case 4: // Calculate area of a rectangle
                        while (length <= 0 || width <= 0) {
                            System.out.println("Enter the length of the rectangle: ");
                            length = sc.nextDouble();
                            System.out.println("Enter the width of the rectangle: ");
                            width = sc.nextDouble();
                            if (length <= 0 || width <= 0) {
                                System.out.println("Invalid input. Please enter a positive number.");
                            } else {
                                System.out.println(
                                        "The area of the rectangle is: " + areaOfRectangle(length, width) + "\n");
                                length = 0;
                                width = 0;
                                break;
                            }
                        }
                        break;
                    case 5: // Calculate perimeter of a rectangle
                        while (length <= 0 || width <= 0) {
                            System.out.println("Enter the length of the rectangle: ");
                            length = sc.nextDouble();
                            System.out.println("Enter the width of the rectangle: ");
                            width = sc.nextDouble();
                            if (length <= 0 || width <= 0) {
                                System.out.println("Invalid input. Please enter a positive number.");
                            } else {
                                System.out.println("The perimeter of the rectangle is: "
                                        + perimeterOfRectangle(length, width) + "\n");
                                length = 0;
                                width = 0;
                                break;
                            }
                        }
                        break;
                    case 6: // Calculate length of diagonal of a rectangle
                        while (length <= 0 || width <= 0) {
                            System.out.println("Enter the length of the rectangle: ");
                            length = sc.nextDouble();
                            System.out.println("Enter the width of the rectangle: ");
                            width = sc.nextDouble();
                            if (length <= 0 || width <= 0) {
                                System.out.println("Invalid input. Please enter a positive number.");
                            } else {
                                System.out.println("The length of the diagonal of the rectangle is: "
                                        + hypotenuse(length, width) + "\n");
                                length = 0;
                                width = 0;
                                break;
                            }
                        }
                        break;
                    case 7: // Calculate area of a square
                        while (length <= 0) {
                            System.out.println("Enter the length/width of the square: ");
                            length = sc.nextDouble();
                            if (length <= 0) {
                                System.out.println("Invalid input. Please enter a positive number.");
                            } else {
                                System.out.println(
                                        "The area of the square is: " + areaOfRectangle(length, length) + "\n");
                                length = 0;
                                break;
                            }
                        }
                        break;
                    case 8: // Calculate perimeter of a square
                        while (length <= 0) {
                            System.out.println("Enter the length/width of the square: ");
                            length = sc.nextDouble();
                            if (length <= 0) {
                                System.out.println("Invalid input. Please enter a positive number.");
                            } else {
                                System.out.println("The perimeter of the square is: "
                                        + perimeterOfRectangle(length, length) + "\n");
                                length = 0;
                                break;
                            }
                        }
                        break;
                    case 9: // Calculate length of diagonal of a square
                        while (length <= 0) {
                            System.out.println("Enter the length/width of the square: ");
                            length = sc.nextDouble();
                            if (length <= 0) {
                                System.out.println("Invalid input. Please enter a positive number.");
                            } else {
                                System.out.println("The length of the diagonal of the square is: "
                                        + hypotenuse(length, length) + "\n");
                                length = 0;
                                break;
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a number 1-10. \n");
                        break;
                }
            }
        }
    }

    public static double hypotenuse(double base, double height) {
        return Math.sqrt(base * base + height * height);
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double perimeterOfTriangle(double base, double height) {
        return base + height + hypotenuse(base, height);
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }
}