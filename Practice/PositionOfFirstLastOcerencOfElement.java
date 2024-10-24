import java.util.Arrays;

public class PositionOfFirstLastOcerencOfElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9, 10, 11 };
        int target = 6;
        int[] positionsArr = positionofElements(arr, target);
        System.out.println(Arrays.toString(positionsArr));
    }

    static int[] positionofElements(int[] arr, int target) {
        int[] newArr = new int[2];
        newArr[0] = binSearch(arr, target, false);
        newArr[1] = binSearch(arr, target, true);
        return newArr;
    }

    static int binSearch(int[] arr, int target, boolean isRight) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (isRight) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
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
