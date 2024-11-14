import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 9, 6, 7, 2, 3, 4 };
        System.out.println(Arrays.toString(arr));
        bubbleSortFun(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortFun(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }
}