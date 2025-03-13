// Renold Thomas
// CalcPi.java
// 13 March 2025 @ 10-10:50 AM
// Program that calculates PI using a certain number of terms in the infinite series.

package renoldthomaslabs.CS0410.Assign8.CalcPi;
import java.util.Scanner;

public class CalcPi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfTerms;
        double pi = 0.0;

        System.out.print("Enter desired number of terms to calculate PI (1 - ∞): ");
        numOfTerms = input.nextInt();

        for (int i = 1; i <= numOfTerms; i++)
            pi += (4*Math.pow(-1, i+1)/(2*i-1));

        System.out.println("PI is approximately " + pi);
    }
}