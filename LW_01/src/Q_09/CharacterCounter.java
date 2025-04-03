package Q_09;
import java.util.*;

public class CharacterCounter {
    Scanner cursor = new Scanner(System.in);
    String text;

    public void textProcess(){
        System.out.print("Enter a String here : ");
        text = cursor.nextLine();
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length()-1));
    }
}
