import java.util.Scanner;

public class MinMaxInThreeNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First num :-  ");
        int num1 = in.nextInt();
        System.out.print("Enter Second num :-  ");
        int num2 = in.nextInt();
        System.out.print("Enter Third num :-  ");
        int num3 = in.nextInt();

        int[] arr = { num1, num2, num3 };
        System.out.println("Min Num :- " + minNum(arr));
        System.out.println("Mix Num :- " + maxNum(arr));

    }

    static int maxNum(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int minNum(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

}
