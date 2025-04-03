package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("temprature in celsius : ");
        double temp = scanner.nextDouble();
        System.out.println("In Fahrenheit = "+((1.8*temp)+32)+" F");

    }
}
