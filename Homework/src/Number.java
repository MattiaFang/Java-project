//求出1~1000的所有完全数。完全数是其所有因子的和（包括1不包括其本身）等于该数
//例如，28 = 1+2+4+7+14，28为完全数
public class Number {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("1~1000的所有完全数为：");
        for(int i=2;i<1001;i++)
        {
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum+=j;
                }
            }
            if(i==sum)
            {
                System.out.println(i);
            }
            sum=0;
        }
    }
}
