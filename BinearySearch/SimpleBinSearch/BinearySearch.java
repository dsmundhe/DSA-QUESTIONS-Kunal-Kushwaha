public class BinearySearch {
    public static void main(String[] args) {
        // Simple Bineary Search

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 }; // Sorted Array in ascending order
        int target = 50;
        int targetIndex = binSearch(arr, target);
        System.out.println("Target Index is : " + targetIndex);
    }

    static int binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // find mid as per start and end
            if (arr[mid] == target) {

                return mid; // return if target at the mid index of target element

            } else if (arr[mid] < target) {

                start = mid + 1; // check mid and change start accordingly

            } else if (arr[mid] > target) {

                end = mid - 1; // check mid and change end accordingly

            }
        }
        return -1; // if target not in array
    }
}
