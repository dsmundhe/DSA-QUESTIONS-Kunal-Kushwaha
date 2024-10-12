public class Practice {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 10, 4, 3 };
        System.out.println("Max element is : " + arr[maxElement(arr)]);
    }

    static int maxElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }
}
