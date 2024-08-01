package wednesday;

import java.util.Scanner;

public class qiuhe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您心中所想的数字:");
        int num = scanner.nextInt();
        int sum = 0;//定义初始之和为0
        while(num % 10 !=0) {
            int a = num % 10;
            sum += a;
            num /= 10;
        }
        System.out.println("您所输入的数字每一位之和是:"+sum);
    }

}
