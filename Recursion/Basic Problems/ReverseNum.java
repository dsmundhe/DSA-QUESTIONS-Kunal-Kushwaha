public class ReverseNum {
    public static void main(String[] args) {
        int result=revNum(12102, 0);
        System.out.println(result);
    }

    static int revNum(int num, int ans) {
        if (num <= 0) {
            return ans;
        }
        ans=ans * 10 + num %10;
        return revNum(num/10, ans);
    }
}
