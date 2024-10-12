public class RotationCount {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 14, 15, 4, 5, 6, 7, 8, 9 };
        System.out.println("Total Rotation is : " + findRotation(arr));
    }

    static int findRotation(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    static int findPivot(int[] arr) {
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
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else if (arr[mid] > arr[start]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
