package work;

import java.util.Scanner;

public class jiecheng {
    public int getFac(int m) {
        if (m == 1) {
            return 1;
        } else {
            return m * getFac(m - 1);
        }
    }

    public static void main(String args[]) {
        jiecheng fac = new jiecheng();
        // System.out.println(fac.getFac(4));
        int sum = 0;
        System.out.println("输入n的值：");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            sum += fac.getFac(i);
        }
        System.out.println("sn:" + sum);
    }
}
