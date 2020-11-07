import static java.lang.StrictMath.PI;
import static java.lang.StrictMath.pow;

public class Circle {
    private double centerX;
    private double centerY;
    private double radius;
    public double getArea(){
        return pow(this.radius,2)*PI;
    }
    public double getPerimeter(){
        return this.radius*PI*2;
    }
    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void changeRadius(double radius){
        this.radius = radius;
    }
    public double printRadius(){
        return this.radius;
    }
}
