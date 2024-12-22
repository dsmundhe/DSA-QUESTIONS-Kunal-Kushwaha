import java.util.*;

public class LargestNumFromNums {
    public static void main(String[] args) {
        int largestNum = maxNum();
        System.out.println("The Largest Num is : " + largestNum);
    }

    static int maxNum() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>(5);
        while (true) {
            System.out.print("Enter num : ");
            int num = in.nextInt();

            if (num == 0) {
                try {
                    int max = nums.get(0);
                    for (int i = 0; i < nums.size(); i++) {
                        if (max <= nums.get(i)) {
                            max = nums.get(i);
                        }
                    }
                    return max;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("Enter some nums first!");
                }
            }
            nums.add(num);
        }
    }
}
