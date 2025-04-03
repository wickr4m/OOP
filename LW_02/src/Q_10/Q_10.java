package Q_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat intrest = new DecimalFormat("0.000%");
        DecimalFormat decimal = new DecimalFormat("$0.00");

        System.out.println("Enter loan amount : ");
        double dollars = scanner.nextDouble();

        System.out.println("Enter the annual interest rate : ");
        double interest = scanner.nextDouble();

        System.out.println("Enter the loan period : ");
        int years = scanner.nextInt();

        double monthlyInterestRate = (interest/100.0)/MONTHS_IN_YEAR;
        int noOfPayments = years*MONTHS_IN_YEAR;
        double monthlyPayment = (dollars*monthlyInterestRate / (1-Math.pow(1/(1+monthlyInterestRate),noOfPayments)));
        double totalPayment = monthlyPayment*noOfPayments;

        System.out.println("Your Monthly interest rate = " + intrest.format(monthlyInterestRate) + "\nNo. of Payments = " + noOfPayments + "\nMonthly payment = " + decimal.format(monthlyPayment) + "\nTotal Payment = " + decimal.format(totalPayment));
    }
}
