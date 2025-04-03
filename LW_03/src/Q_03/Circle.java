package Q_03;

public class Circle {

    private double radius;

    public Circle(double radi){
        this.radius = radi;
    }

    public double computeArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double computeCircumference(){
        return 2*Math.PI*radius;
    }
}
