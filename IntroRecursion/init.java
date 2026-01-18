public class init {
    public static void main(String[] args) {
        // write a function that prints hello world
        // Question : only 1 function you have to call and that should print hello world 5 times .
        // and you cannot modify the function also
        // now what you do ? i create a new functions message1 and message 2 ase than in message
        // function i call message 1
        // in message1 i call message2
        message();
    }

    static void message() {
        System.out.println("Hello world");
        message1();
    }

    static void message1() {
        System.out.println("Hello world");
        message2();
    }

    static void message2() {
        System.out.println("Hello world");
        message3();
    }

    static void message3() {
        System.out.println("Hello world");
        message4();
    }

    static void message4() {
        System.out.println("Hello world");
    }
}
