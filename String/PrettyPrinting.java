public class PrettyPrinting {
    public static void main(String[] args) {

        System.out.println("Hello DM!");

        // Format specifires

        // integer value
        int a = 10;
        System.out.printf("a = %d \n", a); // (\n) for new line

        // float value
        float b = 555.639f;
        System.out.printf("b = %f \n", b);

        // Round up value
        System.out.printf("b = %.2f \n", b);
        System.out.printf("b = %.1f \n", b);

        // Print PI value
        System.out.println(Math.PI);

        // string format specifire
        String name = new String("Dipak Mundhe");
        String college = "YCCE";
        System.out.printf("Name of student is %s and college of student is %s ! ", name, college);
    }
}
