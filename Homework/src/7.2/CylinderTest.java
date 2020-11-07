import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        double radius;
        double height;
        System.out.println("请输入底面圆的半径：");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        System.out.println("请输入圆柱的高度：");
        height = input.nextDouble();
        Cylinder b = new Cylinder(radius,height);
        System.out.println("底面圆的半径:"+radius);
        System.out.println("圆柱的高度:"+height);

        System.out.println("圆柱的表面积为："+ b.getArea());
        System.out.println("圆柱的体积为："+ b.getVolume());

    }
}
