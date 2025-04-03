package Q_08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("Enter radius : ");
        int r = scanner.nextInt();

        double v = (4/3.0)*(PI*Math.pow(r,3));

        System.out.println("volume = " + decimal.format(v));
    }
}
