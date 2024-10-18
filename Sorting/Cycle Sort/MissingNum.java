import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 0 };
        Cysort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findMissingNum(arr));
    }

    static int findMissingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i) {
                return i;
            } else {
                i++;
            }
        }
        return arr.length;
    }

    static void Cysort(int[] arr) {
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
