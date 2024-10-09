public class PerfectSquareRoot {
    public static void main(String[] args) {

        int[] arr = { 10, 15, 26, 28, 25, 36, 68, 95, 63, 56 };
        int result = findPerfectSquare(arr);
        System.out.println("Perfect Square is : " + result);
    }

    static int findPerfectSquare(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int squrt = (int) Math.pow(arr[i], 0.5f);
            for (int j = 0; j < arr.length; j++) {
                if (squrt * squrt == arr[j]) {
                    return arr[j];
                }
            }
        }
        return -1;
    }
}
