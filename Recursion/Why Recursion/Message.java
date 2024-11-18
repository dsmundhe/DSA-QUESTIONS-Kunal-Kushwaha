public class Message {
    public static void main(String[] args) {
        // print hello world message 5 times using 5 call of functions

        // one way to do this task

        // message();
        // message1();
        // message2();
        // message3();
        // message4();
        // message5();

        // another way to do this task
        // call functions one another in each functions
        message();
    }

    static void message() {
        System.out.println("Hello World!");
        message1();
    }

    static void message1() {
        System.out.println("Hello World!");
        message2();
    }

    static void message2() {
        System.out.println("Hello World!");
        message3();
    }

    static void message3() {
        System.out.println("Hello World!");
        message4();
    }

    static void message4() {
        System.out.println("Hello World!");
        message5();
    }

    static void message5() {
        System.out.println("Hello World!");
    }
}