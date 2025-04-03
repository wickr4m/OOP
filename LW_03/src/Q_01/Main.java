package Q_01;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp;

        System.out.print("Enter temperature in celsius : ");
        temp = input.nextDouble();
        Temperature inF = new Temperature(temp);

        System.out.print(temp + " C = " + inF.toFahrenheit() + " F");
    }
}