import java.util.Scanner;

public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num to search : ");
        int target = in.nextInt();
        System.out.println(linSearch(arr, 0, target));
    }

    static int linSearch(int[] arr, int index, int target) {
        if (index > arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linSearch(arr, index + 1, target);
    }
}
