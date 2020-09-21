import java.util.Random;
import java.util.Scanner;
public class Stone {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("你出什么？（石头（2）、剪刀（1）、布（0））：");
        int ch = input.nextInt();
        Random r = new Random(1);
        int num = r.nextInt(3);
        System.out.println(num);
    }
}
