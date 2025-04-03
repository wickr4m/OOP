package Q_01.b.Q_01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X : ");
        int x = scanner.nextInt();
        System.out.print("Y : ");
        int y = scanner.nextInt();
        System.out.println("Answer = "+(int) (x+4*Math.pow(y,3)));
    }

}
