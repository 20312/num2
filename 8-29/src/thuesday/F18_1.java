package thuesday;

import java.util.Scanner;

public class F18_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("输入数据量n：");
        int n=sc.nextInt();
        System.out.print("输入2*n个数据：");
        int s1=0,s2=0;
        int a[]=new int[n];

        for (int i=0;i<n;i++){
            s1+= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            s2+=sc.nextInt();
        }
        System.out.print("企业盈利："+(s1-s2));
    }
}
