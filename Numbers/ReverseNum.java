import java.util.*;

public class ReverseNum {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter num:- ");
      int num = sc.nextInt();
      System.out.println(reverseNum(num));
   }

   static int reverseNum(int num) {
      int newNum = 0;
      while (num > 0) {
         int rem = num % 10;
         newNum = newNum * 10 + rem;
         num = num / 10;
      }
      return newNum;
   }
}
