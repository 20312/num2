package work;

import java.util.Scanner;

public class shuhe {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("请输入第一位数:");
        double d1=sc.nextDouble();
        System.out.println("请输入第二位数:");
        double d2=sc.nextDouble();
        int sum = 0;
        for(double i=d1;i<=d2;i++) {
                sum +=i;
        }
        System.out.println(sum);

}}
