public class ShuffleString {

    public static void main(String[] args) {
        String newStr = new String("");
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        String s = "codeleet";
        for (int i = 0; i < indices.length; i++) {
            newStr += s.charAt(indices[i]);
        }
        System.out.println(newStr);

    }

}