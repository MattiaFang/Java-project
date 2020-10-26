public class Vehicle {
    public double speed;
    public int power;

    public void speedUp(double s)
    {
        this.speed = s;
        System.out.println("已加速，当前速度为："+s);
    }

    public void speedDown(double s)
    {
        this.speed = s;
        System.out.println("已降速，当前速度为："+s);
    }

    public void setPower(int p)
    {
        this.power = p;
    }

    public int getPower()
    {
        return power;
    }
}
