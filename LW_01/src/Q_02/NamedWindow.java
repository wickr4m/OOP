package Q_02;
import javax.swing.*;
import java.util.*;
public class NamedWindow {
    Scanner cursor = new Scanner(System.in);
    String fName,lName;

    public void displayWindow(){
        JFrame newWindow = new JFrame(fName+" "+lName);
        newWindow.setVisible(true);
        newWindow.setSize(800,600);
    }

    public void getName(){
        System.out.print("Enter your first name : ");
        fName = cursor.next();
        System.out.print("Enter your last name : ");
        lName = cursor.next();
        displayWindow();

    }
}
