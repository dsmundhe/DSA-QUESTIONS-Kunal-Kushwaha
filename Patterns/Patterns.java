public class Patterns {
    public static void main(String[] args) {

        // //patern 1
        // pattern1(4);

        // // patern 2
        // pattern2(4);

        pattern3(4);

    }

    // ****
    // ****
    // ****
    // ****

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    // *
    // **
    // ***
    // ****
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    // reverse of pattern 2
    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n - row; col >= 0; col--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}