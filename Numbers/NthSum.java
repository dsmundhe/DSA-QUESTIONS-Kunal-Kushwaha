import java.util.*;

public class NthSum {
    public static void main(String[] args) {
        sumOfNums();
    }

    static void sumOfNums() {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter num:- ");
            int num = in.nextInt();
            if (num == 0) {
                System.out.println("The sum is :- " + sum);
            } else {
                sum += num;
            }
        }

    }
}
