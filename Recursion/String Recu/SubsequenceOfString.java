public class SubsequenceOfString {
    public static void main(String[] args) {
        subSet("abc", "");

    }

    static void subSet(String st, String p) {
        if (st.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = st.charAt(0);
        subSet(st.substring(1), p + ch);
        subSet(st.substring(1), p);
    }
}
