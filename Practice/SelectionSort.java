import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 5, 4, 3, 10, 2, 6, 11 };
        System.out.println(Arrays.toString(arr));
        selSortFun(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selSortFun(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxElement = arr[0];
            int maxIndex = 0;

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] >= maxElement) {
                    maxElement = arr[j];
                    maxIndex = j;
                }
            }

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}