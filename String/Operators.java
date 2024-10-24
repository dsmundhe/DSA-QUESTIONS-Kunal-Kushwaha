public class Operators {
    public static void main(String[] args) {
        // 'a' + 'b'
        System.out.println('a' + 'b'); // print sum of hashCode

        // 'a' + 10;
        System.out.println('a' + 20); // print sum of num and char hashCode

        // 10 + 'a'
        System.out.println(10 + 'a');

        // (char) ('a' + 1) = b
        System.out.println((char) ('a' + 1)); // b
        System.out.println((char) ('a' + 2)); // c

        // "a" + "b"
        System.out.println("a" + "b"); // ab

        // "a" + 10
        System.out.println("a" + 10); // a10

        // 10 + "a"
        System.out.println(10 + "a"); // 10a

        // Array + "a"
        System.out.println(new int[] { 5, 6, 7 } + "dm"); // [5,6,7]dm 'print in coded format '

        // not possible in java
        // System.out.println(new int[] {} + new Integer(0));
        // System.out.println(new int[] {} + new Integer(0)+ "dm");
    }
}
