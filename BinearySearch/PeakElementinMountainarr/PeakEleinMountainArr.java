public class PeakEleinMountainArr {

    // find peak element in mountain array
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 100, 30, 20, 10 };
        int result = findPeakEle(arr);
        System.out.println("Peak Element is : " + arr[result]);
    }

    static int findPeakEle(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return end;
    }
}
