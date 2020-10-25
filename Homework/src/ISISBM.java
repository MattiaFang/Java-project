import java.util.Scanner;

public class ISISBM {
    public static  boolean isISBM(String s)
    {
        if(s.length()!=17)//13个数字加4个‘-’
        {
            return false;
        }
        String []str = s.split("[-]");
        if(str.length==5)
        {
            if(str[0].length()==3 && str[1].length()==1 && str[2].length()==3 && str[3].length()==5 && str[4].length()==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串书号：");
        String s = sc.nextLine();
        if(isISBM(s))
            System.out.println(s+":该书号合法。");
        else
            System.out.println(s+":该书号不合法。");
    }
}
