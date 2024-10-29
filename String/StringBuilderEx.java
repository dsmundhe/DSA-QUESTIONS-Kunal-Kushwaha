import java.util.*;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String example = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            example += ch;
        }
        System.out.println(example);

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.charAt(0));
        System.out.println(builder.length());
        System.out.println(builder.indexOf("b"));
        System.out.println(builder.indexOf("c"));
    }
}
