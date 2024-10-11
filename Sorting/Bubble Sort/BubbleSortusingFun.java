import java.util.*;

public class BubbleSortusingFun {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 0 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // function for bubble sort
    static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    // swapping logic
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                    // if array is sorted so avoide extra checking for best case
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
