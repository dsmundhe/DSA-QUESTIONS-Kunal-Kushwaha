import java.util.*;

public class PracticePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name:- ");
        String name = sc.next();
        if (isPalindrome(name)) {
            System.out.println(name + " This is an Palindrome String!");
        } else {
            System.out.println(name + " This is not an Palindrome String!");
        }
    }

    static boolean isPalindrome(String name) {
        int start = 0;
        int end = name.length() - 1;

        while (start <= end) {
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
