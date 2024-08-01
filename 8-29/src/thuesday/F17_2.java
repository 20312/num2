package thuesday;

import java.util.Scanner;

public class F17_2 {
    public static void main(String[] args) {
        System.out.print("输入整数n：");
        int n = new Scanner(System.in).nextInt();
        System.out.print("符合要求的数有：");
        for (int i = 1; i <= n; i++) {
            if ((i * 5 - 14) == (i * 2 + 4)) {
                System.out.print(i + " ");
            }
        }
    }
}
