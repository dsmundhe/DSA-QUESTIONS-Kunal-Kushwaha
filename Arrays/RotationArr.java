import java.util.Arrays;

public class RotationArr {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 50, 60, 70, 80 },
                { 90, 100, 110, 120 },
                { 130, 140, 150, 160 }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j > arr[i].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]));
        }
    }
}
