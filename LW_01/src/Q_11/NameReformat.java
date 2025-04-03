package Q_11;
import java.util.*;

public class NameReformat {
    Scanner cursor = new Scanner(System.in);
    String fName,mName,lName;

    public void nameReformat(){
        System.out.print("Enter your first name : ");
        fName = cursor.next();
        System.out.print("Enter your middle name : ");
        mName = cursor.next();
        System.out.print("Enter your last name : ");
        lName = cursor.next();

        System.out.println(lName+","+" "+fName+" "+mName.charAt(0)+".");
    }


}
