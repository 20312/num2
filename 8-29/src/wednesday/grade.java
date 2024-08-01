package wednesday;

import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
   int n=1,yx=0,jg=0,bjg=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("输入n个学生成绩");
        while(n>0) {
            n=sc.nextInt();
            if(n>=85) yx++;
            if(n>=60&&n<=84) jg++;
            if(n>=60&&n>0) bjg++;
        }
        System.out.println("优秀"+yx);
        System.out.println("及格"+jg);
        System.out.println("不及格"+bjg);

    }
}
