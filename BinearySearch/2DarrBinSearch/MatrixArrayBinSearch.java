import java.util.Arrays;

public class MatrixArrayBinSearch {

    // we have an 2d array which is sorted in row and column format
    // and we have to find target elemnet indexes
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 12, 22, 32, 42 },
                { 15, 25, 35, 46 },
                { 20, 30, 40, 50 }
        };
        int target = 30;
        System.out.println(Arrays.toString(MatrixSearch(arr, target)));

    }

    static int[] MatrixSearch(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row <= arr.length - 1 && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            }
            if (arr[row][col] > target) {
                col--;
            }
            if (arr[row][col] < target) {
                row++;
            }
        }
        return new int[] { -1, -1 };
    }
}