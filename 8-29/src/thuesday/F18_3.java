package thuesday;

import java.util.Scanner;

public class F18_3 {

    public static void main(String[] args) {
//		int word,space,num,other=0;
        System.out.println("请输入一行字符");
        Scanner scan=new Scanner(System.in);
        String str;
        char c;
        int word=0,space=0,number=0,other=0;
        str=scan.nextLine();
        for(int i=0;i<str.length();i++) {
            c=str.charAt(i);
            if(c>='a'&&c<='z'||c>='A'&&c<='Z') {
                word++;
            }else if(c==' ') {
                space++;
            }else if(c>='0'&&c<='9') {
                number++;
            }else {
                other++;
            }
        }
        System.out.println("英文字母有："+word+" 空格有："+space+" 数字有："+number+" 其他字符有："+other);

}}
