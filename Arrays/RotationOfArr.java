public class RotationOfArr {
    public static void main(String[] args) {
        int[][] arr = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        };
        
        int n = arr.length;
        int[][] arr1 = new int[n][n];
        
        // Step 1: Transpose the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = arr[i][j];
            }
        }
        
        // Step 2: Reverse each row to achieve 90-degree clockwise rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr1[i][j];
                arr1[i][j] = arr1[i][n - 1 - j];
                arr1[i][n - 1 - j] = temp;
            }
        }
        
        // Print the rotated array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
