package word;

import java.util.Scanner;

public class T4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据的个数：");
        int scan = scanner.nextInt();
        int[] year = new int[scan];
        System.out.println("请输入" + scan + "个年份：");
        for (int i = 0; i < year.length; i++) {
            year[i] = scanner.nextInt();
            if (year[i] % 4 == 0 && year[i] % 100 != 0 || year[i] % 400 == 0) {
                System.out.println("是");
            } else {
                System.out.println("否");
            }
        }
    }
}
