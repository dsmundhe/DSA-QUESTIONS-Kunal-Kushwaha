import java.util.Arrays;

public class ContainDuplicate01 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 5 };
        System.out.println(contDuplicate(arr));
    }

    static boolean contDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
