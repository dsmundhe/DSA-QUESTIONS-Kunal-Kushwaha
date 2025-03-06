import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class SumOfTringle {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };


        printTrinangle(arr);
        


        for(int[] val: getArrays(arr)){
            System.out.println(Arrays.toString(val));
        }

    }

    public static int[][] getArrays(int[] arr) {
        List<int[]> list = new ArrayList<>();

        return list.toArray(new int[list.size()][]);

    }

    public static void generateArr(int[] arr, List<int[]> list) {
        if (arr.length < 1) {
            return;
        }
        list.add(arr);
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int num = arr[i] + arr[i + 1];
            newArr[i] = num;
        }
        generateArr(newArr, list);

    }

    public static void printTrinangle(int[] arr) {
        if (arr.length < 1) {
            return;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            int num = arr[i] + arr[i + 1];
            newArr[i] = num;
        }
        printTrinangle(newArr);
        System.out.println(Arrays.toString(arr));
    }
}
