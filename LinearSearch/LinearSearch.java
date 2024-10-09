
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 14, 7, 8, 4, 56, 23, 89, 75 };
        int target = 56;
        int result = search(arr, target);
        System.out.println(result);
    }

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
