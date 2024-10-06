public class SmallestLetterGreTar {

    // find smallest letter which is greater than target
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'e', 'g' };
        char target = 'g';
        char result = findSmallestLetter(arr, target);
        System.out.println(result);
    }

    static char findSmallestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
