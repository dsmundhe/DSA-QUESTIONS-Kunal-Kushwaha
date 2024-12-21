import java.util.*;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:- ");
        int num = sc.nextInt();
        System.out.println(isArmStrongNum(num));
    }

    static boolean isArmStrongNum(int num) {
        int newNum = 0;
        int preNum = num;
        while (num > 0) {
            int rem = num % 10;
            newNum = newNum + (int) Math.pow(rem, 3);
            num = num / 10;
        }

        if (preNum == newNum) {
            return true;
        } else {
            return false;
        }
    }
}
