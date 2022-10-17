import java.lang.Math;

public class Cone {
    private double r;
    private double l;
    private double pi = Math.PI;

    public Cone(double r, double l){
        this.r=r;
        this.l=l;
    }

    public double getArea(){
        return (pi*r*r)+(pi*l*r);
    }
}
