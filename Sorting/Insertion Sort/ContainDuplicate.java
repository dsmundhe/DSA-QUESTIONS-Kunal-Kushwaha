public class ContainDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3,3, 4, 5 };
        System.out.println(duplicateContain(arr));
    }

    static boolean duplicateContain(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
