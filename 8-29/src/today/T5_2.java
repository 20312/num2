package word;

import java.util.Scanner;

public class T5_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        try {
            int a,i,score,first=0,second=0;
            String first_1="",second_1="";
            System.out.print("请输入数据个数: ");
            a=input.nextInt();
            for(i=0;i<a;i++)
            {
                score=input.nextInt();
                if(score>first)
                {
                    second=first;
                    second_1=first_1;
                    first=score;
                    first_1=first+" ";
                    continue;

                }
                if(score>second)
                {
                    second=score;
                    second_1=second+" ";
                }
            }
            System.out.println("最高成绩是 "+first_1);
            System.out.println("第二高成绩是 "+second_1);
        }
        finally {
            input.close();
        }
    }
}
