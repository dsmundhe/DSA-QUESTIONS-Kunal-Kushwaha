public class PalindromeNum {
    public static void main(String[] args) {
        boolean ans=isPalindromeNum(121);
        int ans1=fun1(121);
        System.out.println(ans1);
        System.out.println(ans);
    }

    static boolean isPalindromeNum(int num) {
        if (num == fun1(num)){
            return true;
        }
        return false;
    }

    static int fun1(int num) {
        int digits = (int) (Math.log10(num) + 1);
        return fun2(num, digits);
    }

    static int fun2(int num, int digits) {
        if (num % 10 == num) {
            return num;
        }
        int rem = num % 10;
        return rem * (int) Math.pow(10, digits-1) + fun2(num / 10, digits-1);
    }
}
