public class Patterns01 {
    public static void main(String[] args) {

        // pattern1(4);
        // pattern2(10);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        pattern6(5);
    }

    static void pattern1(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRows = row > n ? n * 2 - row : row;
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col < n - row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row < n * 2; row++) {
            int totalColsInRows = row > n ? n * 2 - row : row;

            int totalSpaces = n - totalColsInRows;

            for (int i = 0; i < totalSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            int totalSpaces = n - row + 1;
            for (int i = 1; i <= totalSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col < row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {

            int totalSpaces = n - row;
            for (int i = 1; i <= totalSpaces; i++) {
                System.out.print("   ");
            }
            for (int col1 = row; col1 >= 1; col1--) {
                System.out.print(col1 + "  ");
            }

            for (int col = 2; col <= row; col++) {
                System.out.print(col + "  ");
            }

            System.out.println(" ");
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRows = row > n ? n * 2 - row : row;
            int totalSpaces = n - totalColsInRows;
            for (int i = 1; i <= totalSpaces; i++) {
                System.out.print("  ");
            }
            for (int col = totalColsInRows; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col1 = 2; col1 <= totalColsInRows; col1++) {
                System.out.print(col1 + " ");
            }
            System.out.println(" ");
        }
    }
}
