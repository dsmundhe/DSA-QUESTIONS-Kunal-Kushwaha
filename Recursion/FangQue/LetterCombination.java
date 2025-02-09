import java.util.ArrayList;

//This Question Asked By GOOGLE

public class LetterCombination {
    public static void main(String[] args) {
        fun("", "12");
        System.out.println();
        System.out.println(funRet("", "12"));
    }

    static void fun(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(" " + p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            fun(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> funRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ls = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            ls.addAll(funRet(p + ch, up.substring(1)));
        }
        return ls;
    }
}
