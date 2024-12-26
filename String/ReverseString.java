public class ReverseString {
    public static void main(String[] args) {
        System.out.println(revString("Dipak"));
    }

    static String revString(String name) {
        String newName = new String();

        for (int i = name.length() - 1; i >= 0; i--) {
            newName += name.charAt(i);
        }

        return newName;
    }
}
