package Q3;

import java.util.Scanner;

public class Q3 {
    public void multiplicationTable(int val){
        for (int i = 1; i < 11; i++){
            System.out.println(val + " x " + i + " = " + (val*i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q3 table = new Q3();

        System.out.print("Enter the number : ");
        int digit = scanner.nextInt();
        table.multiplicationTable(digit);
    }
}
