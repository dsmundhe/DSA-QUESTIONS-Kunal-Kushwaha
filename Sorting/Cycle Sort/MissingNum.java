import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 4, 1, 5 };
        cySort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findMissingNum(arr));
    }

    static int findMissingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[correct] != arr[i]) {
                return i;
            } else {
                i++;
            }
        }
        return arr.length;
    }

    static void cySort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[correct] != arr[i]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}
