package thuesday;

import java.util.Scanner;

public class F19_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        boolean x1 = a % 2 == 0;
//        System.out.println(x1);
        boolean x2 = 4 < a && a <= 12;
        int p1=0,p2=0,p3=0,p4=0;
        if(x1 && x2){
//            System.out.print("1 ");
            p1++;p2 = 1;
        }else {
            if (x1 || x2) {
//                System.out.print("1 ");
                p2 = 1; p3 = 1;
            } else {
                p4++;
            }
        }
        System.out.println(p1 + " " + p2 + " " + p3 + " " );
    }

}
