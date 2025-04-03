package Q_08;

import java.util.*;

public class StringSeparate {
    Scanner cursor = new Scanner(System.in);
    String text;
    Integer breakingPoint;

    public void separateString(){
        System.out.print("Enter the String with a single exclamation mark :  ");
        text = cursor.nextLine();
        breakingPoint = text.indexOf("!");
        System.out.println(text.substring(0,breakingPoint));
        System.out.println(text.substring(breakingPoint+1));

    }
}
