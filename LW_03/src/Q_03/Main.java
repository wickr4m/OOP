package Q_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double innerRadius;
        double outerRadius;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Enter the radius of the inner circle : ");
        innerRadius = input.nextDouble();
        Circle innerCircle = new Circle(innerRadius);

        System.out.print("Enter the radius of the outer circle : ");
        outerRadius = input.nextDouble();
        Circle outerCircle = new Circle(outerRadius);

        System.out.print("Shaded area = " + df.format(outerCircle.computeArea()-innerCircle.computeArea()));
    }


}
