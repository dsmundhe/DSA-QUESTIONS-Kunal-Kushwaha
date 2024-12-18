import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 7, 6, 3, 2, 5, 1, 4 };
        selSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int maxElement = arr[0];
            int maxIndex = 0;

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > maxElement) {
                    maxIndex = j;
                    maxElement = arr[j];
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
