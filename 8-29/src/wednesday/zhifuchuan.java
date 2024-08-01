package wednesday;

import java.util.Scanner;

public class zhifuchuan {
    public static  StringBuffer mergedString3(String string1, String string2) {
        StringBuffer sb = new StringBuffer(string1);
        return sb.append(string2);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入字符串1:");
        String string1 = input.nextLine();
        System.out.print("请输入字符串2:");
        String string2 = input.nextLine();


        System.out.println("新字符串是:" + mergedString3(string1,string2));
    }

}
