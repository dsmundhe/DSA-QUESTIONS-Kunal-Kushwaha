import java.util.Arrays;
import java.util.Scanner;

public class NuniqueIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        if (num % 2 == 0) {
            newArr(arr, num);
        } else {
            newArr(arr, num - 1);
            arr[num - 1] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void newArr(int[] arr, int length) {
        for (int i = 1, a = 0; a < length; i++) {
            arr[a] = 1;
            arr[a + 1] = -i;
            a += 2;
        }
    }
}
