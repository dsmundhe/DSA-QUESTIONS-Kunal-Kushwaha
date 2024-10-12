
public class PivotinRoatedArr {
    public static void main(String[] args) {
        int[] arr = { 10, 12, 14, 15, 7, 8, 9 };
        int result = findPivot(arr);

        if (result != -1) {
            System.out.println("Pivot element is : " + arr[result]);
        } else {
            System.out.println("Pivot element index is : " + result);

        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            return -1;
        }
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
