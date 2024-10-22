import java.util.Arrays;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 7, 6, 9, 3, 2, 4 };
        int result = thirdMaxNum(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[result]);
    }

    static int thirdMaxNum(int[] nums) {
        int firstMax = 0;
        int secondMax = 0;
        int thirdMax = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int maxElement = nums[0];
            int maxIndex = 0;
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > maxElement) {
                    maxElement = nums[j];
                    maxIndex = j;
                }
            }
            count++;
            if (count == 1) {
                firstMax = nums[maxIndex];
            } else if (count == 2) {
                secondMax = nums[maxIndex];
            } else if (count == 3) {
                thirdMax = nums[maxIndex];
            }
        }
        if (nums.length > 2) {
            return thirdMax;
        } else {
            return firstMax;
        }
    }
}
