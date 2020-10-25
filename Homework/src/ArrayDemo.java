import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static int[] locateLargest(double [][] a)
    {
        int []res = new int[2];
        int x=0,y=0;
        double max=a[0][0];
        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a[0].length;j++)
            {
                if(a[i][j]>max)
                {
                    x = i;
                    y = j;
                    max = a[i][j];
                }
            }
        }
        res[0] = x;
        res[1] = y;
        return res;
    }

    public static void main(String[] args) {
        System.out.print("请输入数组的行数和列数： ");
        Scanner sc = new Scanner(System.in);
        int ha = sc.nextInt();
        int li = sc.nextInt();
        double [][]a=new double[ha][li];
        System.out.println("请输入每行元素值：");
        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a[0].length;j++)
            {
                a[i][j] = sc.nextDouble();
            }
        }
        //System.out.println(a[1][2]);
        int []ret = locateLargest(a);
        System.out.println("最大元素的位置是("+ret[0]+","+ret[1]+")");

    }
}
