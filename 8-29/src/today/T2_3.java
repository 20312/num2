package word;

import java.util.Scanner;

public class T2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[10];
        System.out.print("请输入10个数组元素值:");
        for (int i=0;i<10;i++){
            sum[i] =sc.nextInt();
        }
        System.out.print("请输入数值val(0<val<1000):");
        int val =sc.nextInt();
        int k =0;
        for(int i=0; i<sum.length; i++){
            if (sum[i] !=val){
                sum[k] =sum[i];
                k++;
            }
        }
        System.out.println(k);
        sc.close();
    }
}
