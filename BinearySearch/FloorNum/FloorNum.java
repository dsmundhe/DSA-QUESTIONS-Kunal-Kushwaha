
public class FloorNum {

    // Floor num
    // find Greater number which is less or equal to target num

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int target = 5;
        int result = findFloorNum(arr, target);
        System.out.println("Floor num index  is : " + result);
    }

    static int findFloorNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] > target) {
            return -1; // if target not lie between the start to end
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return end; // after loop terminate end will point Floor num
    }
}
