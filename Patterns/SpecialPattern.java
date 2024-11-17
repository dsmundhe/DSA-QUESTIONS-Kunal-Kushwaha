public class SpecialPattern {
    public static void main(String[] args) {
        // pattern1(4);
        pattern2(3);

    }

    static void pattern1(int n) {
        n = n * 2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int indexAtValue = Math.min(Math.min(col, row), Math.min(n - row, n - col));
                System.out.print(indexAtValue+ " ");
            }
            System.out.println(" ");
        }
    }

    static void pattern2(int n){
        int originalN=n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int valueAtindex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(valueAtindex + " ");
            }
            System.out.println(" ");
        }
    }
}
