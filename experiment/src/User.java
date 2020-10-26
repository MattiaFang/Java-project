public class User {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setPower(100);
        System.out.println("当前小车功率为："+v.getPower());
        v.speedUp(80.5);
        v.speedDown(55.3);
    }
}
