import java.util.*;;

public class SumInList {
    public static void main(String[] args) {
        sumInListFun();
    }

    static void sumInListFun() {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        while (true) {
            System.out.print("Enter Num :- ");
            int num = in.nextInt();

            try {
                if (num == 0) {
                    int negativeNumSum = 0;
                    int positiveEvenSum = 0;
                    int positiveOddSum = 0;

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) < 0) {
                            negativeNumSum += list.get(i);
                        } else if (list.get(i) % 2 == 0) {
                            positiveEvenSum += list.get(i);
                        } else if (list.get(i) % 2 != 0) {
                            positiveOddSum += list.get(i);
                        }
                    }

                    System.out.println(list);
                    System.out.println("Even nums Sum : " + positiveEvenSum);
                    System.out.println("Odd nums Sum : " + positiveOddSum);
                    System.out.println("Negative nums Sum : " + negativeNumSum);
                    return;

                }
                list.add(num);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
