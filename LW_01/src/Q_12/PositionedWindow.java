package Q_12;

import javax.swing.*;
public class PositionedWindow {
    JFrame window = new JFrame("My First Frame");

    public void setframe() {
        window.setVisible(true);
        window.setSize(300,200);
        window.setLocation(100,50);
    }

}
