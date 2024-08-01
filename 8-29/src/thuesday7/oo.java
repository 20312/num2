package thuesday7;

import java.util.Scanner;

public class oo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请分别输入n个不同的数字：" );
        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int m=2*n;
        int[] num = new int[m];
        int count = 0;
        for(int i = 0;i<m;i++)
        {
            num[i] = scanner.nextInt();
        }
        for(int j = 0;j<m;j++)
        {
            if(num[j]%3 == 0)
            {
                System.out.println(num[j]);
                count++;
            }
        }
    }
}
