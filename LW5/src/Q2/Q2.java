package Q2;

import java.util.Scanner;

public class Q2 {
    public void guessDigits(int digit){
        String val = Integer.toString(digit);
        System.out.println("value has " + val.length() + " digits");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q2 digitCount = new Q2();
        System.out.println("Enter a value to count no. of digits | enter a negative value to stop : ");
        int variable = scanner.nextInt();
        while(variable >= 0){
            digitCount.guessDigits(variable);
            System.out.println("Enter a value to count no. of digits | enter a negative value to stop : ");
            variable = scanner.nextInt();
        }
        System.out.println("Exiting...");

    }
}
