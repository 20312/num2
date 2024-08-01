package thuesday;

import java.util.Scanner;

public class F19_3 {
    public static void main(String[] args) {
//字符串对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入字符串: ");
        String str = sc.nextLine();
//求和变量
        int sum=0;
//遍历字符串
        for(int i=0;i<str.length();i++){
//获取每个字符
            char c=str.charAt(i);
//判断是否是数字
            if(c>='0'&&c<='9'){
//求和
                sum+=c-'0';//保证得到的一定是数字值
            }
        }
        System.out.println(sum);
    }

}
