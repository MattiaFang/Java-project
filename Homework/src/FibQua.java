public class FibQua {
    public static long fib(int n)
    {
        if(n<3)
            return 1;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        for(int i =1; i<=20; i++)
        {
            System.out.println(fib(i));
        }
    }
}
