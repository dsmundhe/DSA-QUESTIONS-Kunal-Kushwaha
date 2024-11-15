import java.util.*;

public class AllDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 4, 5, 7, 8, 2, 2, 4, 6, 9 };
        cySortFun(arr);
        System.out.println(Arrays.toString(arr));
        List nums = disAppearedNums(arr);
        System.out.println(nums);
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

    static void cySortFun(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int orgPosition = arr[i] - 1;
            if (arr[i] != arr[orgPosition]) {
                int temp = arr[orgPosition];
                arr[orgPosition] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}
