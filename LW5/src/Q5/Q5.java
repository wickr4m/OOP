package Q5;

import java.util.Scanner;

public class Q5 {
    public String palidromeCheck(String text){
        StringBuilder converted = new StringBuilder(text);
        return converted.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q5 convert = new Q5();

        System.out.print("Enter the word : ");
        String text = scanner.nextLine();
        String output = convert.palidromeCheck(text);
        if (text.equals(output)){
            System.out.println("String is palidrome");
        }else
            System.out.println("String is not palidrome");
    }
}
