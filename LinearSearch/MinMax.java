public class MinMax {
    public static void main(String[] args) {
        int[] arr = { 14, 58, 96, 75, 36, 25, 48, 69, 86 };
        int maxElement = findMax(arr);
        int minElement = findMin(arr);
        System.out.println("Max Element : " + maxElement);
        System.out.println("Min Element : " + minElement);
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }
}
