package work;

import java.util.Scanner;

public class shusu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=0;
        for ( i = 2; i < Math.sqrt(n) ; i++) {    //从2循环到根号n
            if(n%i==0){
                System.out.println(n+"不是素数");
                break;
            }
        }
        if(i==Math.sqrt(n)){
            System.out.println(n+"是素数");
        }
    }

    }

