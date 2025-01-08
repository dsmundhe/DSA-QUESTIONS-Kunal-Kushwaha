public class AndOperator {
    public static void main(String[] args) {

        // find weather number odd of not

        int num = 14;

        System.out.println(isOdd(num));

    }

    static boolean isOdd(int num) {
        if ((num & 1) == 1) {
            return true;
        } else {
            return false;
        }

    }

}