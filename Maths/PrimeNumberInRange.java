public class PrimeNumberInRange {
    public static void main(String[] args) {
        int num = 20;
        boolean[] arr = new boolean[num + 1];
        prime(arr, num);
    }

    static void prime(boolean[] arr, int num) {

        for (int i = 2; i * i <= num; i++) {
            for (int j = i * 2; j <= num; j += i) {
                arr[j] = true;
            }
        }

        for (int i = 2; i <= num; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }

    }
}
