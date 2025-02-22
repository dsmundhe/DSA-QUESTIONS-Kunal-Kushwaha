public class RomanToInteger {
    public static void main(String[] args) {
        String s = "III";
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() && (s.charAt(i) == 'I' && s.charAt(i + 1) != 'I')) {
                num += (romanFun(s.charAt(i + 1)) - 1);
                i++;
            } else {
                num += romanFun(s.charAt(i));
            }
        }
        System.out.println(num);
    }

    static int romanFun(char s) {
        if (s == 'I') {
            return 1;
        } else if (s == 'V') {
            return 5;
        } else if (s == 'X') {
            return 10;
        } else if (s == 'L') {
            return 50;
        } else if (s == 'C') {
            return 100;
        } else if (s == 'D') {
            return 500;
        } else if (s == 'M') {
            return 1000;
        }
        return -1;
    }
}
