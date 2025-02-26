public class FinalKeyword {
    public static void main(String[] args) {

        final int a = 50;

        // those variables are assign with final keyword those can not be reassign
        // a=20;

        System.out.println(a); // a=50
        fun(a);
        System.out.println(a); // a=50
    }

    final static void fun(int a) {
        // this is happing because in java there is pass by value concept ;
        a = a * 5;
        System.out.println("value : " + (++a));
    }
}
