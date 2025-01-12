public class ExORoperator {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 5, 5, 1, 3, 3, 4 };

        System.out.println(uniqueNum(arr));
    }

    static int uniqueNum(int[] arr) {
        int unique = 0;

        for (int num : arr) {
            unique ^= num;
        }
        return unique;
    }
}
