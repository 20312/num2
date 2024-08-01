package thuesday;

import java.sql.SQLOutput;
import java.util.Scanner;

public class daon {


    /*该数的5倍减14等于它的2倍加4。*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int j=0,m=0;
        int count=0;
        for(int i=1;i<=N;i++){

            if(j*5-14==m*2+4){
                count++;
            }
        }
        System.out.println(count++);
    }

}
