// Renold Thomas
// BarSales.java
// 13 March 2025 @ 10-10:50 AM
// Program that reads a series of sales as pairs of inputs– candy bar name and quantity sold and calculate the costs.

package renoldthomaslabs.CS0410.Assign8.BarSales;

import java.util.Scanner;

public class BarSales {
    public static void main(String[] args) {
        final double TWIX_PRICE = 1.59;
        final double KITKAT_PRICE = 1.69;
        final double SNICKERS_PRICE = 1.99;
        final double PAYDAY_PRICE = 2.49;
        final double MILKYWAY_PRICE = 1.49;

        Scanner input = new Scanner(System.in);
        String productCode;
        int quantity;
        double twixCost = 0.00;
        double kitkatCost = 0.00;
        double snickersCost = 0.00;
        double paydayCost = 0.00;
        double milkywayCost = 0.00;
        double totalCost;

        System.out.print("Please enter the product code and quantity: ");
        productCode = input.next().toUpperCase();
        quantity = Integer.parseInt(input.next());

        while (!(productCode.equals("XXX") && quantity == -1)) {
            boolean validInput = false;
            while (!validInput) {
                switch (productCode) {
                    case "TWIX":
                    case "KITKAT":
                    case "SNICKERS":
                    case "PAYDAY":
                    case "MILKYWAY":
                        if (quantity >= 0) {
                            validInput = true; // Both product and quantity are valid
                        } else {
                            System.out.print("Error. Quantity cannot be negative. Re-enter product code and quantity: ");
                            productCode = input.next().toUpperCase();
                            quantity = Integer.parseInt(input.next());
                        }
                        break;
                    default:
                        System.out.print("Error. Invalid product code. Re-enter product code and quantity: ");
                        productCode = input.next().toUpperCase();
                        quantity = Integer.parseInt(input.next());
                }
            }

            // Process the valid input and calculate the cost
            switch (productCode) {
                case "TWIX":
                    twixCost += TWIX_PRICE * quantity;
                    break;
                case "KITKAT":
                    kitkatCost += KITKAT_PRICE * quantity;
                    break;
                case "SNICKERS":
                    snickersCost += SNICKERS_PRICE * quantity;
                    break;
                case "PAYDAY":
                    paydayCost += PAYDAY_PRICE * quantity;
                    break;
                case "MILKYWAY":
                    milkywayCost += MILKYWAY_PRICE * quantity;
                    break;
            }
            System.out.print("Please enter the product code and quantity: ");
            productCode = input.next().toUpperCase();
            quantity = Integer.parseInt(input.next());
        }

        totalCost = twixCost + kitkatCost + snickersCost + paydayCost + milkywayCost;

        System.out.print("Twix: " + (int) (twixCost / TWIX_PRICE) + " items");
        System.out.printf("    Price = $%.2f\n", twixCost);

        System.out.print("KitKat: " + (int) (kitkatCost / KITKAT_PRICE) + " items");
        System.out.printf("    Price = $%.2f \n", kitkatCost);

        System.out.print("Snickers: " + (int) (snickersCost / SNICKERS_PRICE) + " items");
        System.out.printf("    Price = $%.2f \n", snickersCost);

        System.out.print("PayDay: " + (int) (paydayCost / PAYDAY_PRICE) + " items");
        System.out.printf("    Price = $%.2f \n", paydayCost);

        System.out.print("MilkyWay: " + (int) (milkywayCost / MILKYWAY_PRICE) + " items");
        System.out.printf("    Price = $%.2f \n", milkywayCost);

        System.out.printf("Total Price: %.2f", totalCost);
    }
}