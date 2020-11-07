public class CircleTest {
    public static void main(String[] args) {
        Circle a = new Circle(3.0);
        System.out.println("圆的半径为："+a.printRadius());
        System.out.println("圆的周长为："+a.getPerimeter());
        System.out.println("圆的面积为："+a.getArea());
        a.changeRadius(5.0);
        System.out.println("圆的半径为："+a.printRadius());

    }
}
