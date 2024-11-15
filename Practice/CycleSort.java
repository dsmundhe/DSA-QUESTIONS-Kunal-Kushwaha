import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        cySortFun(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cySortFun(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int orgPosition = arr[i] - 1;
            if (arr[i] != arr[orgPosition]) {
                int temp = arr[i];
                arr[i] = arr[orgPosition];
                arr[orgPosition] = temp;
            } else {
                i++;
            }
        }

    }
}