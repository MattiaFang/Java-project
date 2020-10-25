import java.util.Scanner;

public class MoFang {
    public static void main(String[] args) {
        System.out.print("请输入模仿矩阵的大小（0~99）： ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a=new int[n][n];
        int x = 0;
        int y = n/2;
        for(int i =1;i <= n*n;)
        {
            a[x][y]=i;
            x--;
            y++;
            if(x==-1)
            {
                x=n-1;
            }
            if(y==n)
            {
                y=0;
            }
            if(a[x][y]!=0)
            {
                x+=2;
                y--;
                if(x>n-1)
                {
                    x -= n;
                }
                if(y==-1)
                {
                    y=n-1;
                }
            }
            i++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
