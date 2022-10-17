import java.lang.Math;

public class Circle {
    private double r;
    private double pi = Math.PI;
    
    public Circle(double r){
        this.r = r;
    }

    public double getArea() {
        return (pi*r*r);
    }

}
