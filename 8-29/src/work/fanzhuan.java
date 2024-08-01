package work;

import java.util.Scanner;

public class fanzhuan {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("请输入一个字符串：");

            String line = sc.nextLine();

            String str = String_reverse(line);

            System.out.println("s:" + str);

        }

        public static String String_reverse(String s) {

            String s1 = "";

            for (int i = s.length() - 1; i >= 0; i--){

                s1 += s.charAt(i);

            }

            return s1;

        }

    }


