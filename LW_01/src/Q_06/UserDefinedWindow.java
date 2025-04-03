package Q_06;
import javax.swing.*;
import java.util.*;
public class UserDefinedWindow {
    JFrame display = new JFrame();
    Scanner cursor = new Scanner(System.in);
    String title;
    Integer width, height;

    private void createDisplay(){
        display.setTitle(title);
        display.setSize(width,height);
        display.setVisible(true);
    }

    public void displayAttrib(){
        System.out.print("Enter the Window title : ");
        title = cursor.nextLine();
        System.out.print("Enter W (width) : ");
        width = cursor.nextInt();
        System.out.print("Enter H (height) : ");
        height = cursor.nextInt();

        createDisplay();
    }
}
