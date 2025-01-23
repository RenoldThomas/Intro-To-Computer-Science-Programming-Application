// Renold Thomas
// SumSeries.java
// 23 January 2025 @ 10-10:50 AM
// Program to calculate a sum series

package renoldthomaslabs.CS0410.Assign3;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int highestPower;
        double ratio;
        double sumSeries;

        // Get inputs from user
        System.out.println("Enter a positive integer for n (highest power): ");
        highestPower = userInput.nextInt();
        System.out.println("Enter a real number for r (ratio): ");
        ratio = userInput.nextDouble();

        // Sum Series Calculations
        sumSeries = ((Math.pow(ratio, highestPower + 1) - ratio) / (ratio - 1));

        // Print results
        System.out.printf("\nSum is %.2f", sumSeries);
    }  
}