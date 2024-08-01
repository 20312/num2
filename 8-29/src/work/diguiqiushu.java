package work;

import java.util.Scanner;
import java.util.StringTokenizer;

public class diguiqiushu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入内容：");

        String str = scan.nextLine();

        char[] s = str.toCharArray();

        for (int i = s.length - 1; i >= 0; i--) {

            System.out.print(s[i]);
        }
    }
}
