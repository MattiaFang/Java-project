public class Cylinder extends Circle{
    double height;

    public double getArea() {
        return super.getArea()*2+super.getPerimeter()*height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    public Cylinder(){
        this(0.0,0.0);
    }

    public Cylinder(double radius,double height){
        super.changeRadius(radius);
        this.height = height;
    }
}
