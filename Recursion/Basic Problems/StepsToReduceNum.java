public class StepsToReduceNum {
    public static void main(String[] args) {
        // steps to reduce num into zero
        // num == even then num = num/2;
        // num!= even then num =num-1

        int ans = fun1(14);
        System.out.println(ans);

    }

    static int fun1(int num) {
        int counter = 0;
        return fun2(num, counter);
    }

    static int fun2(int num, int counter) {
        if (num == 0) {
            return counter;
        }
        if (num % 2 == 0) {
            counter++;
            return fun2(num / 2, counter);
        }
        counter++;
        return fun2(num - 1, counter);
    }
}
