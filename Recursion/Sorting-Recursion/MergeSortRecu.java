import java.util.Arrays;

public class MergeSortRecu {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 2, 1, 0 };
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // Through Inplace Logic
    static void mergeSortInplace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);

        mergerInPlace(arr, s, mid, e);
    }

    // Merger inplace

    static void mergerInPlace(int[] arr, int s, int mid, int e) {

        int[] mixArr = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mixArr[k] = arr[i];
                i++;
            } else {
                mixArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mixArr[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mixArr[k] = arr[j];
            j++;
            k++;
        }
        for (int f = 0; f < mixArr.length; f++) {
            arr[ f+s] = mixArr[f];
        }
      
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] arr) {
        int[] mixArr = new int[first.length + arr.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < arr.length) {
            if (first[i] < arr[j]) {
                mixArr[k] = first[i];
                i++;
            } else {
                mixArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mixArr[k] = first[i];
            i++;
            k++;
        }
        while (j < arr.length) {
            mixArr[k] = arr[j];
            j++;
            k++;
        }
        return mixArr;
    }
}
