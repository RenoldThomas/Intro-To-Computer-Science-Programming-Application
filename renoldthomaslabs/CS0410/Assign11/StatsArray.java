// Renold Thomas
// StatsArray.java
// 3 April 2025 @ 10-10:50 AM
// Program to calculate stats based on user input for size and values

package renoldthomaslabs.CS0410.Assign11;

import java.util.Scanner;

public class StatsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        // Find highest number
        int highestNumber = numbers[0];
        for (int num : numbers) {
            if (num > highestNumber) {
                highestNumber = num;
            }
        }
        System.out.println("The highest number is: " + highestNumber);

        // Calculate and print mean
        double mean = 0;
        for (int num : numbers) {
            mean += num;
        }
        mean /= size;
        System.out.printf("The mean is: %.2f%n", mean);

        // Calculate and print standard deviation
        double sumOfSquares = 0;
        double sum = 0;
        for (int num : numbers) {
            sumOfSquares += Math.pow(num, 2);
            sum += num;
        }
        double variance = sumOfSquares - ((sum * sum)/size);
        double standardDeviation = Math.sqrt(variance / size);
        System.out.printf("The standard deviation is: %.2f%n", standardDeviation);

        // Calculate and print # of numbers within one standard deviation of the mean
        double lowerBound = mean - standardDeviation;
        double upperBound = mean + standardDeviation;
        int countWithinOneStdDev = 0;
        for (int num : numbers) {
            if (num >= lowerBound && num <= upperBound) {
                countWithinOneStdDev++;
            }
        }
        System.out.println("The number of values within one standard deviation of the mean is: " + countWithinOneStdDev);

    }
}