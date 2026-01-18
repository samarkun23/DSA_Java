public class NumberExapleRecursion {
    public static void main(String[] args) {

        print(1);
    }

    static void print(int n) {

        if (n == 5) {
            // this is the base condition of the recustion
            System.out.println(5);
            return;
        }

        System.out.println(n);
        print(n + 1);
        // this is recursive call
    }
}
