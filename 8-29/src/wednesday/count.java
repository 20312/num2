package wednesday;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入您要计算长度的字符串: ");
        String str = sc.nextLine();
        count(str);
    }
    /**
     * 直接打印结果
     * @param str
     */
    public static void count(String str){
        System.out.println("您输入的字符串长度为："+str.length()+" 个字符");
    }

}
