import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        revArrFun(arr);
    }

    public static void revArrFun(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
