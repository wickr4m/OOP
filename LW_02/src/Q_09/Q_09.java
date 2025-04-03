package Q_09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("$0.00");

        System.out.print("Enter the dollar amount = ");
        double dollars = scanner.nextDouble();

        System.out.print("Enter the annual interest rate = ");
        double interest = scanner.nextDouble();

        System.out.print("No. of years = ");
        int years = scanner.nextInt();

        double equationPart = 1 + (interest/100);

        System.out.print("Amount of money after " + years + " years = " + decimal.format(dollars*(Math.pow(equationPart,years))));
    }
}
