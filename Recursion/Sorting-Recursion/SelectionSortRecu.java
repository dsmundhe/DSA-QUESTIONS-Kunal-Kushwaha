import java.util.Arrays;

public class SelectionSortRecu {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 7, 5, 6, 1, 3, 2 };
        selSortRecu(arr, 0, 0, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selSortRecu(int[] arr, int i, int j, int max, int ind) {
        if (i >= arr.length) {
            return;
        }
        if (j < arr.length - i) {
            if (arr[j] > max) {
                max = arr[j];
                ind = j;
            }
            selSortRecu(arr, i, j + 1, max, ind);
        } else {
            int temp = arr[ind];
            arr[ind] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            selSortRecu(arr, i + 1, 0, 0, 0);
        }

    }

    static void selSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxEle = arr[0];
            int maxInd = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] >= maxEle) {
                    maxEle = arr[j];
                    maxInd = j;
                }
            }
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[maxInd];
            arr[maxInd] = temp;
        }
    }
}
