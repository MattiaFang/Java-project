//贷款的月支付额公式：  （贷款总额*月利率）/（1-（1/（1+月利率）^（年数*12）））
import java.util.Scanner;
public class Paymoney {
    public static void main(String[] args) {
        double year_rate;//贷款的年利率(单位%)
        double rate;//贷款的月利率
        double sum;//贷款总额
        int year;//贷款年数
        double payMonth;//贷款的每月支付额
        Scanner input = new Scanner(System.in);//创建一个Scanner实例input
        System.out.print("请输入贷款的年利率（%）: ");
        year_rate = input.nextDouble();//通过input实例读取一个double型数
        rate = year_rate / 12 * 0.01;
        System.out.print("请输入贷款总额（元）: ");
        sum = input.nextDouble();
        System.out.print("请输入贷款年数（年）: ");
        year = input.nextInt();
        payMonth = (sum * rate ) / (1- (1 / Math.pow( (1+rate), year*12) ) );
        System.out.println("月支付金额为： "+ String.format("%.2f",payMonth) + "元");
        System.out.println("总偿还金额为： "+ String.format("%.2f",payMonth*year*12) + "元");
    }
}
