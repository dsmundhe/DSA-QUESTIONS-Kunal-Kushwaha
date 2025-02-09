public class SubString {
    public static void main(String[] args) {
        String str = "1326#";

        for (int i = 0; i < str.length(); i++) {
            if ((i + 2) < str.length() && str.charAt(i + 2) == '#') {
                System.out.println(str.substring(i, i + 2));
                i += 2;
            } else {
                System.out.println(str.charAt(i));
            }

        }
    }
}
