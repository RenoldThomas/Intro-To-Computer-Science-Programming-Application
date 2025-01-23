// Renold Thomas
// Calc.java
// 16 January 2025 @ 10-10:50 AM
// Program to do some simple calculations

package renoldthomaslabs.CS0410.Assign2;

public class Calc {
    public static void main(String[] args) {
        int firstNum = 29645;
        int secondNum = 392;
        int sum; // sum of firstNum and secondNum
        int diff; // difference of firstNum and secondNum
        int product; // product of firstNum and secondNum
        double quotient; // firstNum divided by secondNum
        double average; // average of firstNum and secondNum
        int remainder; // remainder when firstNum is divided by secondNum
        
        sum = firstNum + secondNum;
        diff = firstNum - secondNum;
        product = firstNum * secondNum;
        quotient = (double)firstNum / secondNum;
        average = (firstNum + secondNum) / 2.0;
        remainder = firstNum % secondNum;
        
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + diff);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
        System.out.println("Average is " + average);
        System.out.println("Remainder is " + remainder);
        
    }
}