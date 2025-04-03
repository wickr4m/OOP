package Q_07;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String status = "";
        System.out.print("Enter the weight : ");
        int weight = scanner.nextInt();
        System.out.print("Enter the height : ");
        int height = scanner.nextInt();
        double BMI = (weight/(Math.pow((height/100.0),2)));
        if (BMI > 0 && BMI < 20){
            status = "UNDER WEIGHT";
        } if (BMI >= 20 && BMI <= 25){
            status = "NORMAL";
        } if (BMI > 25){
            status = "OVER WEIGHT";
        }
        System.out.print("Your BMI value is = "+(int) BMI + "\nWeight class --> " + status);

    }
}
