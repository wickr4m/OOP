package Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Enter the year :");
        year = scanner.nextInt();
        if ((year%4 == 0 && year%100 != 0) || (year%4 == 0 && year%100 == 0 && year%400 == 0)){
            ;System.out.println(year + " is a leap year");
        }else {
            System.out.println("not a leap year");
        }
    }
}
