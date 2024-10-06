import java.util.Arrays;

public class FirstandLastPositionOfTarget {

    // Find first and last positon of an array
    // we have an arrary
    // where targeted elemnt is getting duplicate
    // we have to find its first and last position

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 40, 40, 40, 50, 60, 60, 70, 80, 90 };
        int target = 40;
        int[] result = firstandLastP(arr, target);
        System.out.println(Arrays.toString(result));

    }

    static int[] firstandLastP(int[] arr, int target) {
        int[] resultArr = new int[2];
        resultArr[0] = binSearch(arr, target, true);
        resultArr[1] = binSearch(arr, target, false);
        return resultArr;

    }

    static int binSearch(int[] arr, int target, boolean findIndex) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (findIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return ans;
    }
}
