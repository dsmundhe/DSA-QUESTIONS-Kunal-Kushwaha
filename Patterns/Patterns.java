public class Patterns {
    public static void main(String[] args) {

        // //patern 1
        // pattern1(4);

        // // patern 2
        // pattern2(4);

        // //pattern 3
        pattern3(4);

        // // pattern 4
        // pattern4(4);

        // pattern 5
        // pattern5(7);

        // // pattern 6
        // pattern6(5);

        // pattern 7
        // pattern7(5);

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

    // other way to solve
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    // patern 4
    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            if (row <= (n / 2) + 1) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                for (int col = 1; col <= n - row + 1; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }

    // another way for pattern 5

    static void pattern6(int n) {
        for (int row = 1; row < n * 2; row++) {
            int totalColsInRows = row > n ? n * 2 - row : row;
            for (int col = 1; col <= totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    // pattern 7
    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= n - row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

}