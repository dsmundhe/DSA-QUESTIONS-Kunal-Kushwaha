public class ReverseNum1 {
    public static void main(String[] args) {
        int ans = fun1(89756);
        System.out.println(ans);
    }

    static int fun1(int num) {
        int digits = (int) (Math.log10(num)) + 1;

        return fun2(num, digits);
    }

    static int fun2(int num, int digits) {
        if (num % 10 == num) {
            return num;
        }
        int rem = num % 10;
        return rem * (int) Math.pow(10, digits - 1) + fun2((num / 10), (digits - 1));
    }
}
