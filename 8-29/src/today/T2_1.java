package word;

import java.util.Scanner;

public class T2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入整数");
        int a = sc.nextInt();
        int d = 0;
        System.out.print("逆序的数：");
        while (a > 0) {
            d = a % 10;
            System.out.print("" + d);
            a = a / 10;
        }
        }
}
