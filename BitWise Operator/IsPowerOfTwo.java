import java.util.Scanner;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num :- ");
        int num = in.nextInt();
        System.out.println(num & num-1);
        System.out.println((num & (num - 1)) == 0);
    }
}
