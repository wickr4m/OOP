package Q_01;

public class Temperature {
    private double celsius;

    public Temperature() {

    }

    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public double toFahrenheit(){
        return celsius * 9 / 5 + 32;
    }

    public double toCelsius(){
        return (celsius - 32) * 5 / 9;
    }

    public void setFahrenheit(double fahrenheit){
        this.celsius = fahrenheit;
    }

    public void setCelsius(double celcius){
        this.celsius = celcius;
    }
}
