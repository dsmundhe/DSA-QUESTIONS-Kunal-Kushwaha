public class PerfectSquareinArr {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 23, 25, 5, 85, 10 };
        int num = 25;
        int result = findPerSquare(arr);
        System.out.println(result);
    }

    static int findPerSquare(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int squroot = (int) Math.pow(arr[i], 0.5f);
            for (int j = 0; j < arr.length; j++) {
                if (squroot * squroot == arr[j]) {
                    return arr[j];
                }
            }
        }
        return -1;
    }

}
