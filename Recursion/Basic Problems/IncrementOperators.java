public class IncrementOperators {
    public static void main(String[] args) {
        //infinite loop
        // fun(5);
        fun1(5);
    }

    // infinite loop
    static void fun(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        fun(num--);
    }

    static void fun1(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        fun1(--num);
    }
}
