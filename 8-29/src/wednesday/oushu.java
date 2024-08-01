package wednesday;

import java.util.Scanner;

public class oushu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();//输入个数
        int []g=new int[n];//创建数组
        int sum=0;
        for(int i=0;i<n;i++){//循环
            g[i]=scanner.nextInt();//为数组填入数据
            if(g[i]%2==0){//判断是否为偶数
                sum+=g[i];
            }
        }
        System.out.println(sum);
    }

}
