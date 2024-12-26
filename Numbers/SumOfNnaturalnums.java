import java.util.Scanner;

public class SumOfNnaturalnums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int num = in.nextInt();
        System.out.print("Sum is : " + sum(num));
    }

    static int sum(int n) {
        return (n * (n + 1)) / 2;
    }
}