import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num :- ");
        int num = in.nextInt();
        System.out.println(palindromeNum(num));
        System.out.println(palindromeNumFun(num));
    }

    static boolean palindromeNum(int num) {
        String strNum = Integer.toString(num);
        int start = 0;
        int end = strNum.length() - 1;

        while (start <= end) {
            if (strNum.charAt(start) == strNum.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    static boolean palindromeNumFun(int num) {
        int orgNum = num;
        int revNum = 0;

        while (num > 0) {
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num /= 10;
        }

        return orgNum == revNum;
    }
}
