package Q_04;
import java.util.*;
import java.text.*;
public class DisplayDate {
    Date today = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
    public void showDate(){
        System.out.println(sdf.format(today));
    }
}
