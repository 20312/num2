package work;

import java.util.Scanner;

public class shuzizuanhuan {
    public static void main(String args[])
    {
        int a;
        System.out.println("输入一个整数：");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("八进制："+Integer.toOctalString(a));

    }
}
