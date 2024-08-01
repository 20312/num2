package work;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class work {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");

        String line = sc.nextLine();
        String regx = "(?=.*[a-z])(?=.*\\d)(?=.*[#@!~%^&*])[a-z\\d#@!~%^&*]{6,16}";
        Pattern pattern = Pattern.compile(regx);
//        String pwd = "1a2b3!1a2b3!1a2b3!";
        Matcher m = pattern.matcher(line);
        System.out.println("字符串"+line+"是否为有效密码：");
        System.out.println(m.find());


    }
}
