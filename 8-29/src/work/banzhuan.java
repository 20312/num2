package work;

import java.util.Scanner;

public class banzhuan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("砖数:");
        double brick=sc.nextDouble();
        System.out.println("人数:");
        double count=sc.nextDouble();
        int man, woman, child;
//        int brick = 36;// 砖头数量
//        int count = 36;// 人数
        for (man = 0; man < brick / 4; man++) {
            for (woman = 0; woman < brick / 3; woman++) {
                for (child = 0; child < brick * 2; child++) {
                    /*
                     * child % 2 == 0 2个小孩一块砖头,一个小孩是没办法搬一块砖头的
                     * count == man + woman + child 人数=36
                     * brick == man * 4 + woman * 3 + child / 2 搬砖数量=36
                     */
                    if (child % 2 == 0 && count == man + woman + child && brick == man * 4 + woman * 3 + child / 2) {
                        System.out.println("男人:" + man + "个 女人:" + woman + "个 小孩:" + child +"个");
                    }
                }
            }
        }

    }
}
