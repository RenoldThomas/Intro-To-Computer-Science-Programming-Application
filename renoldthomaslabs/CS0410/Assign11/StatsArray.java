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
        
    }
}