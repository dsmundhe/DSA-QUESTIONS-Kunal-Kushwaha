import java.util.ArrayList;

public class SubSequence01 {
    public static void main(String[] args) {
        String str = "abc";
        subFun(str, "");
        System.out.println(subFunRec(str, ""));
    }

    static ArrayList subFunRec(String st, String ph) {
        if (st.isEmpty()) {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(ph);
            return ls;
        }
        char ch = st.charAt(0);
        ArrayList<String> left = subFunRec(st.substring(1), ph + ch);
        ArrayList<String> right = subFunRec(st.substring(1), ph);
        left.addAll(right);
        return left;
    }

    static void subFun(String st, String ph) {
        if (st.isEmpty()) {
            System.out.println(ph);
            return;
        }
        char ch = st.charAt(0);
        subFun(st.substring(1), ph + ch);
        subFun(st.substring(1), ph);
    }
}
