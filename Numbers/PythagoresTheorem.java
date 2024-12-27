import java.util.Scanner;

public class PythagoresTheorem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num : ");
        int num1 = in.nextInt();
        System.out.print("Enter second num : ");
        int num2 = in.nextInt();
        System.out.print("Enter third num : ");
        int num3 = in.nextInt();

        System.out.println(pyFun(num1, num2, num3));
    }

    static boolean pyFun(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            return true;
        }

        if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
            return true;
        }

        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            return true;
        }

        return false;
    }
}
