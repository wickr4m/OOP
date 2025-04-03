package Q_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in cm : ");
        double cm = scanner.nextDouble();
        double in = cm/2.54;
        System.out.println(cm+" cm = "+(int) (in/12)+" ft "+(int) (in%12)+" in");
    }
}
