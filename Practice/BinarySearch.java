public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 25, 27, 32, 35, 36, 39, 45, 48 };
        int target = 35;
        int result = binSearch(arr, target);
        System.out.println(result);
    }

    static int binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {

                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
