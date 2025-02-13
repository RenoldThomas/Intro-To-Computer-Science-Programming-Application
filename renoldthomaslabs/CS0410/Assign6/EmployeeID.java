// Renold Thomas
// EmployeeID.java
// 13 February 2025 @ 10-10:50 AM
// Program to display employee's ID given last name, department and birth month.

package renoldthomaslabs.CS0410.Assign6;

import java.util.Scanner;

public class EmployeeID {
    public static void main(String[] args) {
        String employeeID;
        String lastName;
        String department;
        String birthMonth;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your last name: " );
        lastName = input.next().toUpperCase();
        System.out.println("Enter your department name (3 letter abbreviation): ");
        department = input.next().toUpperCase();
        System.out.println("Enter your birth month (3 letter abbreviation): ");
        birthMonth = input.next().toUpperCase();

        //Switch to determine the first letter of ID based on first character of last name
        switch (lastName.substring(0, 1)) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                employeeID = "V";
                break;
            default:
                employeeID = "C";
        }

        //Department code for employee ID
        switch(department) {
            case "ACC":
                employeeID += "101";
                break;
            case "HRS":
                employeeID += "102";
                break;
            case "SAL":
                employeeID += "103";
                break;
            case "FIN":
                employeeID += "104";
                break;
            case "ADV":
                employeeID += "105";
                break;
            case "COM":
                employeeID += "106";
                break;
            default:
                employeeID += "110";
            
        }

        //Birth month code for employee ID
        switch(birthMonth) {
            case "JAN":
            case "FEB":
                employeeID += "01";
                break;
            case "MAR":
            case "APR":
                employeeID += "02";
                break;
            case "MAY":
            case "JUN":
                employeeID += "03";
                break;
            case "JUL":
            case "AUG":
                employeeID += "04";
                break;
            case "SEP":
            case "OCT":
                employeeID += "05";
                break;
            case "NOV":
            case "DEC":
                employeeID += "06";
                break;
        }

        //Last 2 characters of ID based on length of last name
        switch(lastName.length()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                employeeID += "0" + lastName.length();
                break;
            default:
                employeeID += lastName.length();

        }

        System.out.println("Your employee ID is: " + employeeID);

    }
}