package thuesday;

import java.util.Scanner;

public class F19_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请分别输入n个不同的数字：" );
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int[] num = new int[n];
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            num[i] = scanner.nextInt();
        }
        scanner.close();
        for(int j = 0;j<n;j++)
        {
            if(num[j]%3 == 0)
            {
                System.out.println(num[j]);
                count++;
            }
        }
    }
}
