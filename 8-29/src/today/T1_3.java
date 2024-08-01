package word;

import java.util.Scanner;

public class T1_3 {
      public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] fb = new int[21];
            fb[1] = 1;
            fb[2] = 1;
            int n = sc.nextInt();
            for (int i=1;i<=n;i++){
                 if(i==1||i==2){
                       System.out.print(1 +"");
                       continue;
                 }
                 fb[i] = fb[i - 1] + fb[i - 2];
                 System.out.println(fb[i] + "");
            }
      }
}

