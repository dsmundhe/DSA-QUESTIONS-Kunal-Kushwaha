import java.util.*;;

public class SetMisMatch {
    // in the array one num is getting duplicate and thats why it skiping original
    // element
    // so we have find those two nums duplicate and skiped num
    // Array from 1 to n
    // means cycle sort
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 4 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
        // result
        System.out.println(misMatchNums(arr));
    }

    static List misMatchNums(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                nums.add(arr[i]);
                nums.add(i + 1);
                return nums;
            } else {
                i++;
            }
        }
        return nums;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}
