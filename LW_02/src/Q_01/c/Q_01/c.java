package Q_01.c.Q_01;
import java.util.*;
public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X = ");
        double x = scanner.nextDouble();
        System.out.print("Y = ");
        double y = scanner.nextDouble();
        System.out.println("Answer = "+Math.cbrt(x*y));
    }
}
