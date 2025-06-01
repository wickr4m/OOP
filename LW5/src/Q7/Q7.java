package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q7 Replace = new Q7();

        System.out.print("Enter a sentence : ");
        String tense = scanner.nextLine();

        System.out.print("Enter replace word : ");
        String replace = scanner.nextLine();

        System.out.print("Enter replacement word : ");
        String replacement = scanner.nextLine();

        String newTense =tense.replace(replace,replacement);
        System.out.println(newTense);
    }
}
