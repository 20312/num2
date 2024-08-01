package word;

import java.util.Scanner;

public class T3_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("输入整数：");
        int T=in.nextInt();
        while(T>0)
        {
            T--;
            int n=in.nextInt();
            if(n>1000)n=1000;
            double sum=0;
            int i;
            int f=1;
            for(i=1;i<=n;i++)
            {
                sum=sum+f*1.0/i;
                f=-f;
            }
            System.out.printf("%.2f\n",sum);
        }
    }
}
