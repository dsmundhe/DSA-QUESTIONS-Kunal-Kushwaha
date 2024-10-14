import java.util.*;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 4, 1 };
        cySort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cySort(int[] arr) {
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
