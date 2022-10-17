import java.lang.Math;

public class Tetrahedron {
    private double a;
    
    public Tetrahedron(double a){
        this.a = a;
    }

    public double getArea(){
        return ((Math.sqrt(3))*a*a);
    }
}
