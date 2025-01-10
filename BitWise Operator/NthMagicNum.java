import java.util.Scanner;

public class NthMagicNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = in.nextInt();
        System.out.println(magicNum(num));

    }

    static int magicNum(int num) {
        int val = num;
        int mul = 0;
        int counter = 1;

        while (val > 0) {
            int lastNum = val & 1;
            mul += lastNum * Math.pow(5, counter);
            counter++;
            val = val >> 1;
        }
        return mul;
    }
}
