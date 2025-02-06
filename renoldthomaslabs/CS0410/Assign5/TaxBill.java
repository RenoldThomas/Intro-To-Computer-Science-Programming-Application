// Renold Thomas
// SumSeries.java
// 06 February 2025 @ 10-10:50 AM
// Program to calculate income tax, car tax, and tax due given income, car value and age.

package renoldthomaslabs.CS0410.Assign5;

import java.util.Scanner;

public class TaxBill {
    public static void main(String[] args) {
        final double LOWEST_TAX_RATE = 0.006;
        final double MIDDLE_TAX_RATE = 0.011;
        final double HIGHEST_TAX_RATE = 0.016;
        final double CAR_TAX_RATE = 0.0185;

        Scanner input = new Scanner(System.in);
        double income, carValue, incomeTax, carTax, taxCredit, totalTaxDue;
        int age;

        System.out.print("Enter your income ($): ");
        income = input.nextDouble();
        System.out.print("Enter your most valuable car value ($): ");
        carValue = input.nextDouble();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        
        //Income tax calculations
        if (income < 9000) {
            //No Tax
            incomeTax = 0;
        } else if (income < 35000) {
            //0.6% for 9k-35k
            incomeTax = LOWEST_TAX_RATE * (income - 9000);
        } else if (income < 90000) {
            //1.1% for 35k-90k
            incomeTax = (MIDDLE_TAX_RATE * (income - 35000)) + (LOWEST_TAX_RATE * (35000 - 9000));;
        } else {
            //1.6% for 90k+
            incomeTax = (HIGHEST_TAX_RATE * (income - 90000)) + (MIDDLE_TAX_RATE * (90000 - 35000)) + (LOWEST_TAX_RATE * (35000 - 9000));
        }

        //Car Tax calculation
        carTax = CAR_TAX_RATE * carValue;
        
        //Determine tax credit given age
        taxCredit = ((age % 4 == 0) ^ (age % 7 == 0)) ? 600 : 0;

        //Tax Due calculation
        totalTaxDue = (taxCredit >= (incomeTax + carTax)) ? 0 : (incomeTax + carTax - taxCredit);
        

        System.out.printf("\nIncome Tax = $%.2f", incomeTax);
        System.out.printf("\nCar Tax = $%.2f", carTax);
        System.out.printf("\nTax Credit = $%.2f", taxCredit);
        System.out.printf("\nTotal Tax Due = $%.2f", totalTaxDue);
        
    }
}