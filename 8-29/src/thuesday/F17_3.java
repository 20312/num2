package thuesday;

import java.util.Scanner;

public class F17_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = "";
        System.out.println("请输入一段字符串：");
        String str2 = input.next();
        char str3[] = new char[str2.length()];
        //遍历字符串中的每一个字符，通过 ASCll 码， 进行转换。
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') {
                str3[i] = (char) (str2.charAt(i) - 32);
            } else if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z') {
                str3[i] = (char) (str2.charAt(i) + 32);
            } else if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                str3[i] = '*';
            } else {
                str3[i] = str2.charAt(i);
            }
            // 字符拼接
            str1 += str3[i];
        }
        System.out.println(str1);
    }

}
