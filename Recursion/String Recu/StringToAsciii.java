public class StringToAsciii {
    public static void main(String[] args) {
        String str = "b";
        System.out.println(asciiFun(str));
    }

    static int asciiFun(String str) {
        if (str.isEmpty()) {
            return -1;
        }

        return str.charAt(0) + 1 + (asciiFun(str.substring(1)));
    }
}
