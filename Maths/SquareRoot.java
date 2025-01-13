import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = in.nextInt();
        System.out.println(squrt(num));
    }

    static double squrt(int num) {
        int start = 0;
        int end = (num / 4) + 1;
        double root = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return mid;
            }
            if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        double incr = 0.1;
        for (int i = 0; i <= 2; i++) {
            while (root * root <= num) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}