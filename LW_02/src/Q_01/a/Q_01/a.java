package Q_01.a.Q_01;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("A : ");
        int A = scanner.nextInt();
        System.out.print("B : ");
        int B = scanner.nextInt();
        System.out.print("C : ");
        int C = scanner.nextInt();
        System.out.println("Answer = "+(Math.pow(B,2)+(4*A*C)));

    }
}
