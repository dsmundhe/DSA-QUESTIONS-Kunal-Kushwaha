public class FibonachiSeriesFormula {
    public static void main(String[] args) {

        System.out.println(fiboFormula(20));
    }

    static int fiboFormula(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double result = (Math.pow(phi, n)) / Math.sqrt(5);

        return (int) Math.round(result);

    }
}