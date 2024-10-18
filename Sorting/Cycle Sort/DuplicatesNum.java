import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesNum {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 6, 6, 7, 5, 7, 8, 2 };
        sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(disAppearedNums(arr));
    }

    static List disAppearedNums(int[] arr) {
        int i = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                nums.add(arr[i]);
            }
            i++;
        }
        return nums;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}
