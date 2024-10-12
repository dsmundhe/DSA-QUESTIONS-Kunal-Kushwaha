public class FindElementinRoatedArray {
    public static void main(String[] args) {

        int[] arr = { 10, 12, 14, 15, 16, 7, 8, 9 };
        int target = 9;
        System.out.println(findElement(arr, target));
    }

    static int findElement(int[] arr, int target) {
        int pivotIndex = findPivotIndex(arr);
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < target) {
            return binSearch(arr, target, start, pivotIndex);
        } else if (arr[start] > target) {
            return binSearch(arr, target, pivotIndex, end);
        }
        return -1;
    }

    static int findPivotIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binSearch(int[] arr, int target, int start, int end) {
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
