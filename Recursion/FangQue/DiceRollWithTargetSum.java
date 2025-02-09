import java.util.ArrayList;

public class DiceRollWithTargetSum {
    public static void main(String[] args) {
        // fun("", 4);
        System.out.println(funRet("", 4));
        ;
    }

    static void fun(String str, int target) {
        if (target == 0) {
            System.out.println(str);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            fun(str + i, target - i);
        }
    }

    static ArrayList<String> funRet(String str, int target) {
        if (target == 0) {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(str);
            return ls;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(funRet(str + i, target - i));
        }
        return list;
    }
}
