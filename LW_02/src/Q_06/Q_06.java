package Q_06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar bday = new GregorianCalendar();
        GregorianCalendar today = new GregorianCalendar();
        System.out.print("Enter the year you born : ");
        int year = scanner.nextInt();
        bday.set(Calendar.YEAR,year);

        System.out.print("You were born in " + bday.get(Calendar.YEAR) + " and will be (are) "+(today.get(Calendar.YEAR)-bday.get(Calendar.YEAR))+" this year");


    }
}
