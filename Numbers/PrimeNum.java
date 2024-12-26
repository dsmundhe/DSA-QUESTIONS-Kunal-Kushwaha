import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num :- ");
        int num = in.nextInt();
        System.out.println(primeNumFun(num));
    }

    static boolean primeNumFun(int num) {
        int div = 2;

        while (div < (num / 2) + 1) {
            if (num % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }

}
