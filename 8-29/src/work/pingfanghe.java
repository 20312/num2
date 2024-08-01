package work;

import java.util.Scanner;

public class pingfanghe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个三位数字：");
        int myNumber = input.nextInt();
        int a=myNumber%10;
        myNumber/=10;
        int b=myNumber%10;
        int c=myNumber/10;
        System.out.println("个、十、百位的平方和为"+(a*a+b*b+c*c));
    }
}
