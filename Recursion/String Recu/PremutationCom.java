import java.util.ArrayList;

public class PremutationCom {
    public static void main(String[] args) {
        // perComFun("", "abc");
        // System.out.println(perComFunRe("", "abc"));

        System.out.println(perCount("", "abcd"));
    }

    static ArrayList<String> perComFunRe(String p, String ph) {
        if (ph.isEmpty()) {
            ArrayList<String> newArr = new ArrayList<>();
            newArr.add(p);
            return newArr;
        }
        char ch = ph.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(perComFunRe(f + ch + s, ph.substring(1)));
        }
        return ans;
    }

    static int perCount(String p, String ph) {
        if (ph.isEmpty()) {
            return 1;
        }
        char ch = ph.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + perCount(f + ch + s, ph.substring(1));
        }
        return count;
    }

    static void perComFun(String p, String ph) {
        if (ph.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = ph.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            perComFun(f + ch + s, ph.substring(1));
        }
    }

}
