public class CelingNum {

    // Find celing num in sorted array
    // Smaller num which grater or equal to target num

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int target = 45;
        int result = findCelingNum(arr, target);
        System.out.println("Celing Num is : " + arr[result]);

    }

    static int findCelingNum(int[] arr, int target) {
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
        return start; // after loop end start will pont mid + 1 when it will greate than end
    }
}