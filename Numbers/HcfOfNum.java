import java.util.Scanner;

public class HcfOfNum {
    public static void main(String[] args) {
        int hcf = hcfNum();
        System.out.println("HCF is :- " + hcf);
    }

    static int hcfNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd num:- ");
        int num2 = sc.nextInt();
        int hcfnum = 0;
        for (int i = 1; i <= num1 + num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcfnum = i;
            }
        }
        return hcfnum;
    }
}
