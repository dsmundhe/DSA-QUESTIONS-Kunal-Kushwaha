public class RoatedArray {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        System.out.println(search(arr, 5));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] == target) {
                return start;
            }
            if (arr[end] == target) {
                return end;
            }
            if (arr[start] <= arr[mid]) {
                if (target < arr[mid] && target > arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (target >= arr[mid] && target <= end) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}