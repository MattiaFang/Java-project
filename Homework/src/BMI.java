//     BMI=体重(kg)/身高(m)的平方
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;
        Scanner input = new Scanner(System.in);//创建一个Scanner实例input
        System.out.print("请输入身高（m）: ");
        height = input.nextDouble();//通过input实例读取一个double型数
        System.out.print("请输入体重（kg）: ");
        weight = input.nextDouble();
        bmi = weight / Math.pow(height,2);
        System.out.println("bmi为： "+ String.format("%.1f",bmi) );//保留小数点后一位输出
    }
}

//Math.sqrt(double d)  求d的平方根