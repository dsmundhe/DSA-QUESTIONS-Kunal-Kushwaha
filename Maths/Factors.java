import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = in.nextInt();
        System.out.println(factorsFun(num));
    }

    static List factorsFun(int num) {
        ArrayList<Integer> ls = new ArrayList<>(5);
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                ls.add(i);
                if (i != num / i) {
                    ls.add(num / i);
                }
            }

        }
        Collections.sort(ls);
        return ls;
    }
}
