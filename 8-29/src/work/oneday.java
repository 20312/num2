package work;

import java.util.Scanner;

public class oneday {
    public static void main(String[] args) {
        Scanner xh=new Scanner(System.in);
        int x=xh.nextInt();
        int a,b,c,sum;
        a=x/100;
        b=x%100/10;
        c=x%10;
        sum=c*100+b*10+a;
        System.out.println(sum);
    }
}
