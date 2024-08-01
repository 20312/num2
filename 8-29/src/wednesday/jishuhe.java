package wednesday;

import java.util.Scanner;

public class jishuhe {
    public static void main(String[] args) {

        int jishu = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String string = n+"";
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int temp = (int)(charArray[i]-48);
            if(temp%2==0){

            }else{
                jishu+=temp;
            }
        }
        System.out.println(jishu);
    }

    }

