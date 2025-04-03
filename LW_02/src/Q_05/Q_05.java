package Q_05;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in fahrenheit : ");
        double temp = scanner.nextDouble();
        System.out.println(temp+" F = "+((5/9)*(temp-32))+" C");
    }
}
