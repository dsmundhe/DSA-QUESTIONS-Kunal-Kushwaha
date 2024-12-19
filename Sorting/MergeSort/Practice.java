import java.util.Arrays;

class Practice {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 7, 9, 10, 12, 3, 4, 14 };
        System.out.println(Arrays.toString(mergerSort(arr)));
    }

    static int[] mergerSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] leftArr = mergerSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightArr = mergerSort(Arrays.copyOfRange(arr, mid, arr.length));
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

        while (i < leftArr.length) {
            mixArr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            mixArr[k] = rightArr[j];
            j++;
            k++;
        }

        return mixArr;
    }
}