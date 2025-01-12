import java.util.Scanner;

public class NoOfSetBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num :-");
        int num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setBits(num));
        
    }

    static int setBits(int num) {
        int counter = 0;
        while (num > 0) {
            counter++;
            num = num & (num-1);
         }
        return counter;
    }
}
