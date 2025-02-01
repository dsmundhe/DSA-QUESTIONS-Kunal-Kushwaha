public class SkipString {
    public static void main(String[] args) {
        String st = "dipakapple mundhe";
        skip("", st);
        System.out.println(skip(st));

    }

    // with return Type
    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (up.startsWith("apple")) {
            return skip(up.substring(5));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    // without return Type
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (up.startsWith("apple")) {
            skip(p, up.substring(5));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
}
