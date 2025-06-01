package Q4;

import java.util.Scanner;

public class Q4 {
    public void pyramid(int rows){

        for (int i = 1; i <= rows; i++){
            for (int spc = 1; spc <= rows-i; spc++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q4 printPyramid = new Q4();

        System.out.print("Enter the no. of rows : ");
        int rows = scanner.nextInt();
        printPyramid.pyramid(rows);
    }
}
