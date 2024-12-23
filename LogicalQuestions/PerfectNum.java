import java.util.*;

public class PerfectNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num :- ");
        int num = sc.nextInt();
        System.out.println(isPerfectNum(num));

        // 1 to 10000 all perfect Numbers

        for (int i = 1; i <= 10000; i++) {
            if (isPerfectNum(i)) {
                System.out.println(i);
            }
        }

    }

    static boolean isPerfectNum(int num) {
        int totalSum = 0;

        for (int i = 1; i < (num / 2) + 1; i++) {
            if (num % i == 0) {
                totalSum += i;
            }
        }

        if (num == totalSum) {
            return true;
        }
        return false;
    }

}
