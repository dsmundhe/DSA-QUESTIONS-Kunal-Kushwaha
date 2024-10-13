import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 0 };
        selSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] selSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = 0;
            int maxElement = arr[0];
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] >= maxElement) {
                    maxIndex = j;
                    maxElement = arr[j];
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[(arr.length - i) - 1];
            arr[(arr.length - i) - 1] = temp;
        }
        return arr;
    }

}
