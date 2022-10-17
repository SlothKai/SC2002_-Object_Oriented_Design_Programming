public class Triangle {
    private double b,h;

    public Triangle(double h, double b){
        this.b = b;
        this.h = h;
    }

    public double getArea(){
        return 0.5*b*h;
    }
}
