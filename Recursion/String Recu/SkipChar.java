public class SkipChar {

    public static void main(String[] args) {
        String st = new String("dmmimmpmamk");
        skip("", st);
        System.out.println(skip(st));

    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'm') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'm') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
}