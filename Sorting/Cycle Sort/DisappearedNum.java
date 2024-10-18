import java.util.Arrays;

public class DisappearedNum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 0, 5, 6, 3 };
        sort(arr);
        int missingNum = findMissingNum(arr);
        System.out.println(missingNum);
        System.out.println(Arrays.toString(arr));
    }

    static int findMissingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                return i + 1;
            } else {
                i++;
            }
        }
        return arr.length;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (i < arr.length && arr[correct] != arr[i]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}
