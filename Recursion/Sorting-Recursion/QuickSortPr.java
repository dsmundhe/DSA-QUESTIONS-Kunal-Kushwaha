import java.util.Arrays;

public class QuickSortPr {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 3, 2, 1, 0, 7 };
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivotNum = arr[mid];
        while (start <= end) {
            while (arr[start] < pivotNum) {
                start++;
            }
            while (arr[end] > pivotNum) {
                end--;
            }
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        sort(arr, low, end);
        sort(arr, start, high);
    }
}
