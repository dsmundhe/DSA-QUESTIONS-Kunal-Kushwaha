public class TotalNumOfArr {
    public static void main(String[] args) {
        int[] num={9,9,9,9,9,9,9,9,9,9};
        int totalSum=0;
        for (int i = 0; i < num.length; i++) {
            totalSum = totalSum * 10 + num[i];

        }
        System.out.println(totalSum);
    }
}
