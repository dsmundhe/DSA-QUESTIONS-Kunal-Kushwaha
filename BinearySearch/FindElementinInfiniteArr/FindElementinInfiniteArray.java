
public class FindElementinInfiniteArray {

    // Find element in infinite array
    // we have an one array which contains infinite element lets assume
    // which is sorted
    // here we can not use .length function

    public static void main(String[] args) {
        int[] arr = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 25, 26, 27, 28, 29, 30, 31, 35, 39, 40,
                45, 48, 49, 50, 57, 58 };
        int target = 40;
        int result = findElement(arr, target);
        System.out.println(result);
    }

    static int findElement(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // find range where target element lise between them

        while (arr[end] < target) {
            int newStart = end + 1;
            end = (newStart + end) * 2;
            start = newStart;
        }

        return binSearch(arr, target, start, end);
    }

    // this is not sutaible for last range element....

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
