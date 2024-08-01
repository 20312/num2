package thuesday;

import java.util.Scanner;

public class F16_1 {
   /* public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        double avg;
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        double d4 = sc.nextDouble();

        double d5 = sc.nextDouble();

        avg = (d1+d2+d3+d4+d5)/5.0;

        System.out.printf("%.2f",avg);

    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int hi;
        for (int i = 1; i <= 10; i++) {
            System.out.println("请输入第" + i + "个同学身高：");
            int n = sc.nextInt();
            sum += n;


        }

        hi = (sum)/10;

        System.out.println("平均身高为："+hi);

    }
}

