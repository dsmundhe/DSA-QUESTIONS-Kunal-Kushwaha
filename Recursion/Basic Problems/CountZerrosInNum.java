public class CountZerrosInNum {
    public static void main(String[] args) {
        int result=fun1(100150);
        System.out.println(result);
    }

    static int fun1(int num) {
        return fun2(num, 0);
    }

    static int fun2(int num, int counter) {
        if (num == 0) {
            return counter;
        }
        if (num % 10 == 0) {
            counter++;
        }
        return fun2(num/10, counter);
    }
}
