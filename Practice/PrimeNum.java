import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        String result = primeNumorNot(num);
        System.out.println(result);
    }

    static String primeNumorNot(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return "Not Prime num!";
            }
        }
        return "Prime num!";
    }
}