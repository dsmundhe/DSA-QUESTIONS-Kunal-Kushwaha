import java.util.Arrays;

public class BubbleSortRecu {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 1, 2, 8, 3, 6, 4 };
        bubble(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int i, int j) {
        if (i == arr.length) {
            return;
        }
        if (j < arr.length - i) {
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
            bubble(arr, i, j + 1);
        }
        bubble(arr, i + 1, j);
    }

}
