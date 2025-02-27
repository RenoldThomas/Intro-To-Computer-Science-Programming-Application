// Renold Thomas
// SumOddSquares.java
// 27 February 2025 @ 10-10:50 AM
// Program to input an odd positive integer, n, and then calculate and print the sum 1^2 + 3^2 + 5^2 + 7^2 + ....... + n^2.

package renoldthomaslabs.CS0410.InClassAssign;

import java.util.Scanner;

public class SumOddSquares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biggestNumber;
        int sum = 0;

        System.out.print("Enter a positive odd integer (n): ");
        biggestNumber = input.nextInt();

        while (!(biggestNumber > 0) || (biggestNumber % 2 != 1)) {
            System.out.print("Enter a positive odd integer (n): ");
            biggestNumber = input.nextInt();
        }

        while (biggestNumber >= 1) {
            sum = sum + biggestNumber * biggestNumber;
            biggestNumber -= 2;
        }

        System.out.println("Total = " + sum);
    }
}