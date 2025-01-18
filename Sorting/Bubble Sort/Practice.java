import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 9, 4, 5, 1, 6, 3, 2 };
        bubSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
