package Q_01.d.Q_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.print("R = ");
        double r = scanner.nextDouble();
        System.out.println("Area = "+ decimal.format((Math.PI)*Math.pow(r,2)));

    }
}
