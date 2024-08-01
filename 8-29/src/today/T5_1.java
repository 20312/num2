package word;

import java.util.Scanner;

public class T5_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入页数：");
        int n=sc.nextInt();
        int i=0;
        for(i=0;i<n;i++){
            if(n==(1+(2*i-1))*i/2){
                break;
            }

        }
        System.out.println(i);
    }
}
