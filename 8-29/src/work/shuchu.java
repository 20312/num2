package work;

import java.util.Scanner;

public class shuchu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入第一位数:");
        double d1=sc.nextDouble();
        System.out.println("请输入第二位数:");
        double d2=sc.nextDouble();
        System.out.println("请输入第三位数:");
        double d3=sc.nextDouble();

        double max=d1>d2?(d1>d3?d1:d3):(d2>d3?d2:d3);
        double min1=d1<d2?(d1<d3?d1:d3):(d2<d3?d2:d3);
        double  temp=d1+d2+d3-max-min1;

        System.out.println(min1);
        System.out.println(temp);
        System.out.println(max);
    }
}
