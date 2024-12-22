import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String name = sc.nextLine();
        boolean isPalindromeString = isPalindrome(name);
        if (isPalindromeString) {
            System.out.println(name + " This is Palindorem String!");
        } else {
            System.out.println(name + " This is Not Palindrome String!");
        }

    }

    static boolean isPalindrome(String name) {
        int start = 0;
        int end = name.length() - 1;
        while (start <= end) {
            if (name.charAt(start) == name.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
