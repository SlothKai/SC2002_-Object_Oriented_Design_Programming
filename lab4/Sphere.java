public class Sphere {
    private double r;
    private double pi = Math.PI;
        
    public Sphere(double r){
        this.r = r;
    }
    
    public double getArea() {
        return (4*pi*r*r);
    }
    
}
