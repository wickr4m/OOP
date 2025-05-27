package Q5;//package Q5;
//
//import java.util.Scanner;
//
////class Entry{
////    Scanner scanner = new Scanner(System.in);
////    private int choise;
////    public int Entry() {
////        System.out.println("Entry");
////        System.out.println("Tofu Burger\t$3.49\nCajun Chicken\t$4.59\nBuffalo Wings\t$3.99\nRainbow Fillet\t$2.99\n select item : ");
////        choise = scanner.nextInt();
////        return choise;
////    }
////}
//
//public class Q5 {
//    public static void main(String[] args) {
//
//        String items[] = {"Tofu Burger","Cajun Chicken", "Buffallo Wings", "Rainbow Fillet", "Rice Cracker", "No-Sault Fries", "Zucchini", "Brown Rice", "Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
//        double prices[] = {3.49, 4.59, 3.99, 2.99, 0.79, 0.69, 1.09, 0.59, 1.99, 1.90, 2.49, 0.99};
//        String orderItems[] = {};
//        double ordePrice[] = {};
//
//        Scanner scanner = new Scanner(System.in);
//        int catagory;
//        int value = 1;
//        System.out.println("MyJava Lo-Fat Burgers");
//        while(true){
//            System.out.print("Catagories : \n\t1.Entries\n\t2.Side Dish\n\t3.Drink\nChoose a catagory no.: ");
//            catagory = scanner.nextInt();
//
//            switch (catagory){
//                case 1:
//                    System.out.println("Entree");
//                    catagory = 0;
//                    while (value > 0){
//                        System.out.println("1." + items[0] + "\t\t$" + prices[0] + "\n2." + items[1] + "\t\t$" + prices[1] + "\n3." + items[2] + "\t$" + prices[2] + "\n4." + items[3] + "\t$" + prices[3] + "\n\nSelect an Item or enter 0 to move next catagory:");
//                        value = scanner.nextInt();
//                        orderItems[]
//                    }
//
//
//
//
//            }
//
//        }
//    }
//}
import java.util.Scanner;

public class MyJavaMenu {
    static String[] entrees = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
    static double[] entreePrices = {3.49, 4.59, 3.99, 2.99};
    static String[] sides = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
    static double[] sidePrices = {0.79, 0.69, 1.09, 0.59};
    static String[] drinks = {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
    static double[] drinkPrices = {1.99, 1.90, 2.49, 0.99};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entreeChoice = getUserChoice(scanner, "Entree", entrees, entreePrices);
        int sideChoice = getUserChoice(scanner, "Side Dish", sides, sidePrices);
        int drinkChoice = getUserChoice(scanner, "Drink", drinks, drinkPrices);
        double total = entreePrices[entreeChoice] + sidePrices[sideChoice] + drinkPrices[drinkChoice];

        System.out.println("\n--- Order Summary ---");
        System.out.println("Entree: " + entrees[entreeChoice] + " - $" + entreePrices[entreeChoice]);
        System.out.println("Side Dish: " + sides[sideChoice] + " - $" + sidePrices[sideChoice]);
        System.out.println("Drink: " + drinks[drinkChoice] + " - $" + drinkPrices[drinkChoice]);
        System.out.printf("Total: $%.2f\n", total);

        scanner.close();
    }
    
    public static int getUserChoice(Scanner scanner, String category, String[] items, double[] prices) {
        System.out.println("\nChoose a " + category + ":");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %-15s - $%.2f\n", i + 1, items[i], prices[i]);
        }

        int choice;
        while (true) {
            System.out.print("Enter your choice (1-" + items.length + "): ");
            choice = scanner.nextInt();
            if (choice >= 1 && choice <= items.length) {
                return choice - 1;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
