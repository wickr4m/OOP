package Q1;

public class Q1 {
    public void printer(){
        for (int i = 1; i < 5; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(i + "" + j + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Q1 list = new Q1();
        list.printer();
    }
}
