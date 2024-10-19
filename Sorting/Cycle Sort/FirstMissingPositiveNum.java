import java.util.Arrays;

public class FirstMissingPositiveNum {

    // we have to find the first missing positive num in the array
    // that means array might be contains negative elements
    // so here we can use Cycle sort

    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        // Cases arr :
        int[] arr1 = { 1, 2, 0 };
        int[] arr2 = { 7, 8, 9, 10 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
        // result
        System.out.println(firstMissingPositiveNum(arr));
    }

    static int firstMissingPositiveNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = 0;
            if (arr[i] != i + 1) {
                return i + 1;
            } else {
                i++;
            }
        }
        return -1;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] > 0) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    int temp = arr[correct];
                    arr[correct] = arr[i];
                    arr[i] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
    }
}
