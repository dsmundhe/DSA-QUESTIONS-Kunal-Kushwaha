import java.util.*;

class InfiniteNumsSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int count = 1;

    while (true) {
      System.out.print("Enter " + count + " num :- ");
      String val = sc.next();

      if (val.equalsIgnoreCase("x")) {
        System.out.println("The Total Sum is :- " + sum);
        break;
      }

      try {
        int num = Integer.parseInt(val);
        sum += num;
        count++;
      } catch (Exception e) {
        System.out.println(e.getMessage() + " Enter Integer value only! ");
      }
    }

  }
}