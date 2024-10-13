import java.util.Arrays;

public class SelectionSortusingFun {
    public static void main(String[] args) {
        int[] arr = { 5, 25, 86, 0, 23, 3 };
        selSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    // function for selection sort
    static int[] selSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = maxIndex(arr, arr.length - i);
            swap(arr, arr.length - i - 1, maxIndex);
        }
        return arr;
    }

    // fun for find max element in remaining array
    static int maxIndex(int[] arr, int lastPositon) {
        int maxElement = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < lastPositon; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // fun for swap tow nums in the array
    static int[] swap(int[] arr, int num1, int num2) {
        int tepm = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tepm;
        return arr;
    }
}
