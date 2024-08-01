package wednesday;

import java.util.Scanner;

public class douhaofen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");

        String string = sc.nextLine();
        String substring = string.substring(0, string.length() - 0);

        String[] split = substring.split(",");//以逗号分割
        for (String string2 : split) {
            System.out.println( string2);
        }

    }
}
