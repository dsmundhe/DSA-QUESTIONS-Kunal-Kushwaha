import java.util.*;

public class LcmOfNums {
    public static void main(String[] args) {
        int lcm = lcmNum();
        int lcm1 = lcmNumFun();
        System.out.println("LCM is :- " + lcm);
        System.out.println("LCM is :- " + lcm1);
    }

    static int lcmNum() {
        Scanner sc = new Scanner(System.in);
        int lcm = 0;

        System.out.print("Enter 1st num:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd num:- ");
        int num2 = sc.nextInt();

        for (int i = num1 * num2; i > 0; i--) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
            }
        }

        return lcm;

    }

    static int lcmNumFun() {
        Scanner sc = new Scanner(System.in);
        int lcm = 0;

        System.out.print("Enter 1st num:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd num:- ");
        int num2 = sc.nextInt();

        lcm = (num1 * num2) / gcd(num1, num2);
        return lcm;
    }

    // lcm= a*b/gcd(a,b)

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
