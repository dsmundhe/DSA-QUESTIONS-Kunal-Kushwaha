import java.util.*;

class VowelsInString {
    public static void main(String[] args) {
        int countOfVowels = numOfVowels();
        System.out.println("Number of Vowels are :- " + countOfVowels);
    }

    static int numOfVowels() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name :- ");
        String name = sc.nextLine();
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
                    || name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I'
                    || name.charAt(i) == 'O'
                    || name.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
    }

}