package wednesday;

import java.util.Scanner;

public class daoxu {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("请输入任意一位三位数：");
        int n=sc.nextInt();
        int c=n/100;
        n=n%100;
        int b=n/10;
        n%=10;
        int a=n;
        int n1=a*100+b*10+c*1;
        System.out.print(a+"\t"+b+"\t"+c);

    }

}
