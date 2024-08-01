package work;

import java.util.Scanner;

public class huiwen {
    public static void main(String[] args) {

        {
            Scanner sca = new Scanner(System.in);
            String str = sca.nextLine();
            int a = str.length();
            int middle = a / 2, i = 3;
            for (i = 0; i < middle && str.charAt(i) == str.charAt(a - 1 - i); i++) {
            }
            if (i < middle)
                System.out.println(str + "不是回文");
            else
                System.out.println(str + "是回文");
        }
    }
}
