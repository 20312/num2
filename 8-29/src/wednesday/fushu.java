package wednesday;

import java.util.Scanner;

public class fushu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //正数的个数
        int count1 = 0;

        //负数的个数
        int count2 = 0;

        int input = sc.nextInt();

        for(int i = 1;i<=9 ;i++) {
            if (input > 0) {
                count1++;
            } else {
                count2++;
            }
            input = sc.nextInt();
        }

        System.out.println( "负数的个数为" + count2);

    }
}
