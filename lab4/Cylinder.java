import java.lang.Math;

public class Cylinder {
    private double r;
    private double h;
    private double pi = Math.PI;
    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }

    public double getArea(){
        return (2*pi*r*r) + (2*pi*r*h);
    }
}
