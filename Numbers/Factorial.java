import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num :- ");
        int num = in.nextInt();
        System.out.println("Factorail :- " + FactorialOfNum(num));

    }

    static int FactorialOfNum(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
        }

        return num;
    }
}
