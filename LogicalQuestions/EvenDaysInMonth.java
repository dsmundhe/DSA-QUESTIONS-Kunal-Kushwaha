public class EvenDaysInMonth {
    public static void main(String[] args) {
        // let's example of Augest
        System.out.println("In Augest :- " + countEvenDays(31));
    }

    static int countEvenDays(int totalDays) {

        int evenDays = (int) (totalDays - 1) / 2;
        return evenDays;

    }
}
