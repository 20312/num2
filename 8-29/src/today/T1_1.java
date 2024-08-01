package word;

import java.util.Scanner;

public class T1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入x整数：");
        int x=sc.nextInt();
        int y=0;
        if (x>=10){
            y=3*x-11;
        }else if (1<=x && x<10){
            y=2*x-1;
        }else if (x<1){
            y=x;
        }
        System.out.println(y);
    }
}
