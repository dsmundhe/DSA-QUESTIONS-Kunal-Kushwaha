
public class Recursion {
    public static void main(String[] args) {
        // print nums 1 to 10 using recursion
        nums(1);
        messages(1);
    }

    static void nums(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        nums(n + 1);
    }

    static void messages(int num) {
        if (num == 6)
            return;
        System.out.println("Hello World");
        messages(num + 1);
    }
}
