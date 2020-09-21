//石头剪刀布游戏
import java.util.Random;
import java.util.Scanner;
public class Stone {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("你出什么？（石头（2）、剪刀（1）、布（0））：");
        int ch = input.nextInt();
        Random r = new Random();//创建一个对象
        int num = r.nextInt(100)% 3;//生成0~2的随机整数
        //System.out.println(num);
        String com="",you="",ret="";//com表计算机选择 you表用户选择 ret表结果
        switch(num)
        {
            case 0:com="布";break;
            case 1:com="剪刀";break;
            case 2:com="石头";break;
        }
        switch(ch)
        {
            case 0:you="布";break;
            case 1:you="剪刀";break;
            case 2:you="石头";break;
        }
        if( ch-num==1||ch-num==-2)
        {
            ret="你赢了";
        }
        else
        {
            if(ch==num)
            {
                ret="平局了";
            }
            else
            {
                ret="你输了";
            }
        }
        System.out.println("计算机出的是："+com+"，你出"+you+"."+ret);
    }
}
