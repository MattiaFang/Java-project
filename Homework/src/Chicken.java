//鸡兔同笼问题，共有腿100条，头40个，问鸡兔各有多少只。
import java.util.Scanner;
public class Chicken {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //int leg= input.nextInt();
        //int head= input.nextInt();
        int leg=100,head=40;
        int x;//x为鸡的数量 (40-x)为兔的数量
        for(x=0;x<40;x++)
        {
            if(2*x+4*(40-x)==100)
            {
                System.out.println("鸡的数量为"+x+"只,兔的数量为"+(40-x)+"只");
            }
        }
    }
}
