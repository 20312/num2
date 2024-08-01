package thuesday;

import java.util.Scanner;

public class F20_2 {
    public static void main(String[] args){
        int[][] a = new int[3][3];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("第"+(i+1)+"行");
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("第"+(j+1)+"个数：");
                a[i][j]= input.nextInt();
            }
        }
        matrSum(a);
    }
    private static void matrSum(int[][] a){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++){
                if(i==j) sum1 += a[i][j];
                if(j==a.length-i-1) sum2 += a[i][j];
            }
        System.out.println("矩阵对角线之和分别是："+sum1+"和"+sum2);
    }
}


