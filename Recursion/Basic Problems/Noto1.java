public class Noto1 {
    public static void main(String[] args) {
        // fun(5);

        fun1(5);
    }

    static void fun(int num) {
        if (num < 1) {
            return;
        }
        System.out.println(num);
        fun(num - 1);
    }

    static void fun1(int num) {
        if (num <= 1) {
            return;
        }
        System.out.println(num);
        fun(--num);
    }

    
}
