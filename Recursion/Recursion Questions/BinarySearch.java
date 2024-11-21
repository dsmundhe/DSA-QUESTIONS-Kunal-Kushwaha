public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 8, 9, 11, 13, 15, 17 };
        System.out.println(binSearch(arr, 15));
        System.out.println(binSearchRecursion(arr, 15, 0, arr.length - 1));
    }

    // using recursion
    static int binSearchRecursion(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return binSearchRecursion(arr, target, start, mid - 1);
        }
        if (arr[mid] < target) {
            return binSearchRecursion(arr, target, mid + 1, end);

        }
        return -1;
    }

    // using iterations
    static int binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
