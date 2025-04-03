package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter you weight in pounds : ");
        double weight = scanner.nextDouble();
        System.out.println("calorie amount required = "+(weight*19)+" kcal");
    }
}
