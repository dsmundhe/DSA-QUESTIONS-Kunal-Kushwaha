import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num : ");
        int val = in.nextInt();
        System.out.println(isPrime(val));

    }

    static boolean isPrime(int num) {
        int c = 2;
        while (c * c < num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}
