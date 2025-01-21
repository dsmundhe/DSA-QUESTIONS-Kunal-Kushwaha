public class ProductOfDigits {
    public static void main(String[] args) {
        // there should no any zero in num
        int ans = fun(50000022);
        System.out.println(ans);

    }

    static int fun(int num) {
        if (num <= 1) {
            return 1;
        }
        if (num % 10 == 0) {
            return 1 * fun(num / 10);
        }
        return (num % 10) * fun(num / 10);
    }
}
