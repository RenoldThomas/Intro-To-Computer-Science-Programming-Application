// Renold Thomas
// SportsCenter.java
// 27 February 2025 @ 10-10:50 AM
// Program to prints the cost of the activity, the parking cost, the discount and the final price based on certain inputs

package renoldthomaslabs.CS0410.Assign7;

import java.util.Scanner;

public class SportsCenter { 
    public static void main(String[] args) {
        final double NM_PEAK = 10.00;
        final double NM_OFF_PEAK = 9.00;
        final double NM_PARKING = 5.00;
    
        final double M_PEAK = 7.50;
        final double M_OFF_PEAK = 6.50;
        final double M_PARKING = 3.50;

        final double PM_PEAK = 5.00;
        final double PM_OFF_PEAK = 4.00;
        final double PM_PARKING = 2.00;

        final double EM_PEAK = 3.50;
        final double EM_OFF_PEAK = 3.00;
        final double EM_PARKING = 0.00;

        final double CONCESSION_DISCOUNT = 0.10;

        Scanner input = new Scanner(System.in);
        String membershipType;
        String peakTime;
        String concessions;
        double hours = 0;
        double extraHoursSpentInHalfHours = 0;

        double activityCost = 0.00;
        double parkingCost = 0.00;
        double discountPrice;
        double totalCost;

        System.out.print("Which membership (N, M, P, E) do you have? ");
        membershipType = input.next().toUpperCase();
        while (!membershipType.equals("N") && !membershipType.equals("M") && !membershipType.equals("P") && !membershipType.equals("E")) {
            System.out.print("Which membership (N, M, P, E) do you have? ");
            membershipType = input.next().toUpperCase();
        }

        System.out.print("Are you coming during peak hours (Y/N)? ");
        peakTime = input.next().toUpperCase();
        while (!peakTime.equals("Y") && !peakTime.equals("N")) {
            System.out.print("Are you coming during peak hours (Y/N)? ");
            peakTime = input.next().toUpperCase();
        }

        System.out.print("Concessions (Y/N)? ");
        concessions = input.next().toUpperCase();
        while (!concessions.equals("Y") && !concessions.equals("N")) {
            System.out.print("Concessions (Y/N)? ");
            concessions = input.next().toUpperCase();
        }

        System.out.print("How long did you spend in the sports center (in hours)? ");
        hours = input.nextDouble();
        while (hours <= 0.0) {
            System.out.print("How long did you spend in the sports center (in hours)? ");
            hours = input.nextDouble();
        }
        input.close();

        extraHoursSpentInHalfHours = (int) Math.ceil(Math.max(0, (hours-1) * 2));

        switch(membershipType) {
            case "N":
                parkingCost = extraHoursSpentInHalfHours * NM_PARKING;
                activityCost = (peakTime.equals("Y")) ? (hours * NM_PEAK) : (hours * NM_OFF_PEAK);
                break;
            case "M":
                parkingCost = extraHoursSpentInHalfHours * M_PARKING;
                activityCost = (peakTime.equals("Y")) ? (hours * M_PEAK) : (hours * M_OFF_PEAK);
                break;
            case "P":
                parkingCost = extraHoursSpentInHalfHours * PM_PARKING;
                activityCost = (peakTime.equals("Y")) ? (hours * PM_PEAK) : (hours * PM_OFF_PEAK);
                break;
            case "E":
                parkingCost = extraHoursSpentInHalfHours * EM_PARKING;
                activityCost = (peakTime.equals("Y")) ? (hours * EM_PEAK) : (hours * EM_OFF_PEAK);
                break;
        }

        discountPrice = (concessions.equals("Y")) ? ((parkingCost + activityCost) * CONCESSION_DISCOUNT) : 0;
        totalCost = parkingCost + activityCost - discountPrice;

        System.out.println("\nActivity Cost: $" + activityCost);
        System.out.println("Parking Cost: $" + parkingCost);
        System.out.println("Discount Price: $" + discountPrice);
        System.out.println("Total Cost: $" + totalCost + "\n");
    }
}