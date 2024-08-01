package thuesday;

import java.util.Scanner;

public class F18_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a=1,b=2,c,sum =2;
        n=sc.nextInt();
        if(n==1){
            System.out.println("0");
        }else {
            for(int i=3;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
                if(c%2==0){
                    sum+=c;
                }
            }
            System.out.println(sum);
        }
    }
}
