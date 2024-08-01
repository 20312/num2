package work;

import java.util.Scanner;

public class shuziwz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("数字个数：");
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int []b=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(min>b[i]){min=b[i];}
            if(max<b[i]){max=b[i];}
        }
        System.out.println("最小值："+min+"  最大值："+max);
    }
    }

