package wednesday;

import java.util.Scanner;
/*某商场举行购物优惠活动（x代表购物款，y代表折扣）：
当x<1600时， y=0;
1600<=x<2400，y=5%;
2400<=x<3200，y=10%;
3200<=x<6400，y=15%;
x>=6400     ，y=20%。
输入一个顾客的购物款后，显示他应该付的款数(结果保留两位小数)。要求用switch结构实现。
*/
public class chaoshi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float price = scan.nextFloat();

        switch ((int)(price / 1600)) {
            case 0:{
                break;}
            case 1:{
                price *=(1-0.05);
                break;}
            case 2:{
                price *=(1-0.1);
                break;}
                case 3:{
                price *=(1-0.15);
                break;}
            default:{
                price*=(1-0.2);
                break;
            }

    }
        System.out.println(price);
    }}

