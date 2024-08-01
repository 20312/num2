package thuesday;

import java.util.Scanner;

public class F20_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入同学:");
        int n=sc.nextInt();
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                count++;
            }
        }
        System.out.println(count);
    }
}
