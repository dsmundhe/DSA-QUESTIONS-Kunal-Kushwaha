import java.util.Arrays;

public class MergeSortRecu {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 2, 1, 0 };
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
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

    static int[] merge(int[] first, int[] second) {
        int[] mixArr = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mixArr[k] = first[i];
                i++;
            } else {
                mixArr[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mixArr[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mixArr[k] = second[j];
            j++;
            k++;
        }
        return mixArr;
    }
}
