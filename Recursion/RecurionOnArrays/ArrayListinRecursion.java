import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListinRecursion {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 40, 40, 50, 60, 60, 70, 80, 80, 90 };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num to search : ");
        int target = in.nextInt();
        ArrayList<Integer> ans = fun1(arr, target);
        if (ans.size() > 0) {
            System.out.println(ans);
        } else {
            ans.add(-1);
            System.out.println(ans);
        }

    }

    static ArrayList fun1(int[] arr, int target) {
        ArrayList<Integer> ls = new ArrayList<>();
        return linSearch(arr, target, 0, ls);
    }

    static ArrayList linSearch(int[] arr, int target, int index, ArrayList ls) {
        if (index == arr.length) {
            return ls;
        }
        if (arr[index] == target) {
            ls.add(index);
        }
        return linSearch(arr, target, index + 1, ls);
    }
}
