import java.lang.reflect.Array;
import java.util.*;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:- ");
        int num = sc.nextInt();
        System.out.println("The Factors are : " + factorsOfNum(num));
    }

    static List factorsOfNum(int num) {
        ArrayList<Integer> factors = new ArrayList<>(10);

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
