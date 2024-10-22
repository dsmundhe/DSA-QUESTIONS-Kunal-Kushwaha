public class Strings {
    public static void main(String[] args) {
        // create String in java
        String name = "Dipak Mundhe";

        String a = new String("Dipak Mundhe");

        System.out.println(name);
        System.out.println(a);

        // comparision

        System.out.println(a == name); // false because == checks value and reference variable

        System.out.println(a.equals(name)); // true because .equals checkes only values

        String name1 = "Dipak Mundhe";
        String name2 = "Dipak Mundhe";
        System.out.println(name1 == name2); // true

        String name3 = new String("Dipak Mundhe");
        String name4 = new String("Dipak Mundhe");

        System.out.println(name3 == name4); // false
        System.out.println(name3.equals(name4)); // true

    }
}
