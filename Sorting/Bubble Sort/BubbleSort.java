import java.util.Arrays;

public class BubbleSort {

    // Bubble sorting algorithm

    public static void main(String[] args) {

        int[] arr = { 5, 8, 7, 9, 3, 8, 4, 1, 0 };

        // Before sorting
        System.out.println(Arrays.toString(arr));

        // login for sorting

        // for loop or 'i' only for iteration
        for (int i = 0; i < arr.length; i++) {

            // for loop of 'j' is for checking and swapping
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // After sorting
        System.out.println(Arrays.toString(arr));
    }
}