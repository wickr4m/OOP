package Q_05;

import java.text.*;
import java.util.*;

public class ShowDate {
    Date today = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");

    public void showDate() {
        System.out.println(sdf.format(today));
    }
}
