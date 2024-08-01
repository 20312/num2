package today;

import java.util.Scanner;

public class y {
    public static void main(String[] args) {

        System.out.print("请输入数字：");

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine().trim());

        int i = 1;

        while (i <= input) {

            if (i % 2 == 0 && i % 3 != 0) {

                System.out.println("数字：" + i + "是2的倍数但不是3的倍数");

            }

            i++;

        }



    }

}

