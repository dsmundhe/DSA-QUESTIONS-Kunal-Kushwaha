import java.util.*;

public class FunctionsOfString {
    public static void main(String[] args) {
        String st = new String("DIPAK");

        // stirng to charArr
        char[] str = st.toCharArray();
        System.out.println(Arrays.toString(str));

        // chararr to string
        System.out.println(new String(str));

        // sentence to array
        String se = "Dipak Samadhan Munde";
        char[] chArr = se.toCharArray();
        System.out.println(Arrays.toString(chArr));

        // split function
        String[] stArr = se.split(" ");
        System.out.println(Arrays.toString(stArr));

        //reverse String
        System.out.println(se.concat(" DM"));

        char ch1=se.charAt(0);
        System.out.println(ch1);
    }
}
