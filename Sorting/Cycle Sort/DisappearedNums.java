import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNums {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 4, 6 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(disAppearedNums(arr));
    }

    static List disAppearedNums(int[] arr) {
        int i = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        while (i < arr.length) {
            if (arr[i] != i) {
                nums.add(i + 1);
            }
            i++;
        }
        return nums;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}
