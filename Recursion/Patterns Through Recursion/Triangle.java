
public class Triangle {
    public static void main(String[] args) {
        pt(5, 0);
        pt1(5, 0);

    }

    static void pt(int rows, int cols) {
        if (rows == 0) {
            return;
        }
        if (rows > cols) {
            System.out.print(" * ");
            pt(rows, cols + 1);
        } else {
            System.out.println();
            pt(rows - 1, 0);
        }
    }

    static void pt1(int rows, int cols) {
        if (rows == 0) {
            return;
        }
        if (rows > cols) {
            pt1(rows, cols + 1);
            System.out.print(" * ");
        } else {
            pt1(rows - 1, 0);
            System.out.println();
        }
    }
}
