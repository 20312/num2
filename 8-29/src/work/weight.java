package work;

import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x;
        double y;
        double end;
        System.out.print("Enter Your weight(kg): ");
        x=input.nextDouble();
        System.out.print("Enter Your height(m): ");
        y=input.nextDouble();
        end= x/(y*y);
        System.out.println("你的 BMI is: "+end);
        if(end<19.8){
            System.out.println("过轻");
        }else if(end>=19.8 && end<24.2){
            System.out.println("正常");
        }else if(end>=24.2 && end<25){
            System.out.println("过重");
        }else if(end > 25.0){
            System.out.println("肥胖");
        }
    }
}

