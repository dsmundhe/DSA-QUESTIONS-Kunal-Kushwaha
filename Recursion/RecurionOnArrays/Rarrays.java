
public class Rarrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 15, 10, 11, 12 };
        System.out.println(fun1(arr));
        System.out.println(sorted(arr, 0));

    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    static boolean fun1(int[] arr) {
        int len = arr.length - 1;
        int counter = 0;
        return mainFun(arr, counter, len);

    }

    static boolean mainFun(int[] arr, int i, int len) {
        if (i == len) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            i += 1;
            return mainFun(arr, i, len);
        } else {
            return false;
        }

    }
}
