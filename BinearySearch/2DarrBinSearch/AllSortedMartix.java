import java.util.*;

public class AllSortedMartix {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 }
        };
        int target = 7;
        System.out.println(Arrays.toString(allSortedMat(arr, target)));
    }

    static int[] allSortedMat(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row <= arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            }
            if (arr[row][col] < target) {
                row++;
            }
            if (arr[row][col] > target) {
                return binSearch(arr, row, target);
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] binSearch(int[][] arr, int row, int target) {
        int colStart = 0;
        int colEnd = arr.length - 1;
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            } else if (arr[row][mid] > target) {
                colEnd = mid - 1;
            } else if (arr[row][mid] < target) {
                colStart = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
