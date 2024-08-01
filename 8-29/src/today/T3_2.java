package word;

public class T3_2 {
    public static void main(String[] args) {
        int[] num = new int[]{1, 1, 2, 3, 4, 4, 4, 5, 6, 7};
        System.out.println(removeDuplicates(num));

    }

    public static int removeDuplicates(int[] num) {
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != num[index]) {
                num[index + 1] = num[i];
                index++;
            }
        }
        return index+1;

    }
}
