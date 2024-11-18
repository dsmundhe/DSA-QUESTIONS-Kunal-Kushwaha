
public class FibonachiSeries {
    public static void main(String[] args) {
        fibonachiFun(0, 0, 1);
    }

    static void fibonachiFun(int n, int firstNum, int secondNum) {
        if (n == 6)
            return;
        int temp = secondNum;
        secondNum = firstNum + secondNum;
        firstNum = temp;
        System.out.println(firstNum);
        fibonachiFun(n + 1, firstNum, secondNum);
    }
}
