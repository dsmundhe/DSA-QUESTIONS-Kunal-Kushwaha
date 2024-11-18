public class Numbers {
    public static void main(String[] args) {
        // Write a program to print the nums from 1 to 5
        num1(1);
    }

    static void num1(int n) {
        System.out.println(n);
        num2(n + 1);
    }

    static void num2(int n) {
        System.out.println(n);
        num3(n + 1);
    }

    static void num3(int n) {
        System.out.println(n);
        num4(n + 1);
    }

    static void num4(int n) {
        System.out.println(n);
        num5(n + 1);
    }

    static void num5(int n) {
        System.out.println(n);
    }
}

// to solve this above problem we use recursion
// that mean that kind of function who calls itself till the basecase terminate!
