public class BinSearchOptimum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 16, 18 };
        int target = 2;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(search(arr, target, start, end));
    }

    static int search(int[] arr, int target, int start, int end) {

        // if element in not in array
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        // if mid element is greater than target
        if (arr[mid] > target) {
            return search(arr, target, start, mid - 1);
        }

        // if target is greater than mid
        return search(arr, target, mid + 1, end);
    }
}
