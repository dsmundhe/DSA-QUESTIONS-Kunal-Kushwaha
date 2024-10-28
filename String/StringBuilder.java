import java.util.*;

public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String example = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            example += ch;
        }
        System.out.println(example);
    }
}
