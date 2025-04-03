package Q_03;

import java.util.*;

public class DisplayName {
    Scanner cursor = new Scanner(System.in);
    String fName, mName, lName;

    public void nameOutput(){
        System.out.print("Enter your first name : ");
        fName = cursor.next();
        System.out.print("Enter your middle name : ");
        mName = cursor.next();
        System.out.print("Enter your last name : ");
        lName = cursor.next();

        System.out.println(fName+" "+mName.charAt(0)+". "+lName);
    }
}
