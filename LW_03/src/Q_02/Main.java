package Q_02;

import Q_01.Temperature;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double temp;

        System.out.print("Enter temperature in Fahrenheit : ");
        temp = input.nextDouble();
        Temperature inC = new Temperature(temp);
        inC.setFahrenheit(temp);

        System.out.println(temp + " F = " + df.format(inC.toCelsius())+ " C" );
    }
}
