package Q1;

public class Q1 {
    public static void main(String[] args) {
        int x = 10,y = 20 ,z = 12;

        if (x < y){
            if (x < z){
                System.out.println("Smallest value = " + x);
            }else if (z < x){
                System.out.println("Smallest value = " + z);
            }
        }else if (y < z){
            System.out.println("Smallest value = " + y);
        }else
            System.out.println("Smallest value = " + z);
    }
}
