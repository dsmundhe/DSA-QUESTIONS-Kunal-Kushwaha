import java.util.Arrays;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4 };
        cySort(arr);
        int result = findMissNum(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }

    static int findMissNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    static void cySort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}
