package word;

import java.util.Scanner;

public class T4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("学生的成绩是：");
        int grade = scanner.nextInt();
        if (grade >= 90 && grade <=100) {
            System.out.println("优秀");
        } else if (grade >= 80&& grade < 90) {
            System.out.println("良好");
        } else if (grade >= 70&& grade < 80) {
            System.out.println("中等");
        } else if (grade >= 60&& grade < 70) {
            System.out.println("及格");
        } else if (grade >= 0&& grade < 60) {
            System.out.println("不及格");
        }
    }
}
