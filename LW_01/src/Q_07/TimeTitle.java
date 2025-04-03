package Q_07;

import java.text.*;
import java.util.*;
import javax.swing.*;


public class TimeTitle {
    Date newDate = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("h:m:ss a");
    JFrame display = new JFrame(sdf.format(newDate));

    public void timeDisplay() {
        display.setVisible(true);
        display.setSize(500,300);
    }
}
