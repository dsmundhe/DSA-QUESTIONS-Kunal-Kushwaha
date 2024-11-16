import java.util.Arrays;
import java.util.*;

public class ThirdMax {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 5, 1, 2, 2 };
        int result = thirdMax(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(result);
    }

    static int thirdMax(int[] nums) {
        HashSet<Integer> valuse = new HashSet<>();

        for (int num : nums) {
            valuse.add(num);
        }

        Integer[] distinctNums = valuse.toArray(new Integer[0]);
        Arrays.sort(distinctNums, (a, b) -> b - a);
        if (nums.length >= 3) {
            return distinctNums[2];
        } else {
            return distinctNums[0];
        }
    }
}