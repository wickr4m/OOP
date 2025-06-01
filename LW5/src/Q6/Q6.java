package Q6;

import java.util.Random;
import java.util.Scanner;

public class Q6 {
    public int Check(int usrVal, int progVal){
        if (usrVal < progVal){
            return 1;
        }else if (usrVal > progVal){
            return 2;
        }else {
            return 3;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q6 check = new Q6();
        Random random = new Random();

        int randomDigit= random.nextInt(((100-1)+1)+1);
        System.out.println(randomDigit);
        System.out.print("Enter a random digit : ");
        int userVal = scanner.nextInt();
        while(true){
            if (check.Check(userVal, randomDigit) == 1){
                System.out.println("higher!");
            }else if (check.Check(userVal, randomDigit) == 2){
                System.out.println("Lower!");
            }else if (check.Check(userVal, randomDigit) == 3){
                System.out.println("You are correct!");
                break;
            }
            System.out.print("Enter your guess again : ");
            userVal = scanner.nextInt();
        }
    }
}
