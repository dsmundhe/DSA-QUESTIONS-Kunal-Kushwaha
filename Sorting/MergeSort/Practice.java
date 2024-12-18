import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 5, 6, 3, 2, 1, 4 };
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] leftArr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(leftArr, rightArr);
    }

    static int[] merge(int[] leftArr, int[] rightArr) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mixArr = new int[leftArr.length + rightArr.length];

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                mixArr[k] = leftArr[i];
                i++;
            } else {
                mixArr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (j < rightArr.length) {
            mixArr[k] = rightArr[j];
            k++;
            j++;
        }

        while (i < leftArr.length) {
            mixArr[k] = leftArr[i];
            k++;
            i++;
        }
        return mixArr;
    }
}