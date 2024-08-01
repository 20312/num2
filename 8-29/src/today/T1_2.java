package word;
import java.util.ArrayList;


public class T1_2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 5, 6, 7, 2, 8};
        int[] arr2 = new int[]{4, 9, 0, 2, 7};
        System.out.println(getIntersection(arr1, arr2).toString());
    }
    public static ArrayList<Integer> getIntersection(int[] arr, int[] arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0 || arr2 == null || arr2.length == 0) {
            return res;
        }

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == temp && !res.contains(temp)) {
                    res.add(temp);
                    break;
                }
            }
        }
        return res;
    }
}