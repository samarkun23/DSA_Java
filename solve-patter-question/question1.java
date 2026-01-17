
public class question1 {

    public static void main(String[] args) {
        // pattern(2); 
        // patter2(3);
        // pattern3(4);
        // pattern5(5);
        patter6(5);
    }

    static void pattern(int n){
        // n = 3
        // ***
        // ***
        // ***
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* "); 
            } 
            System.out.println();
        }
    }

    static void patter2(int n){
        // n = 3
        // ***
        // **
        // *
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < (n - row); col++) {
                System.out.print("* "); 
            } 
            System.out.println();
        }
    }

    static void pattern3(int n){
        // n = 4
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " "); 
            }
            System.out.println();
        }
    }

    static void pattern4(int n ){
        for (int row = 1; row <= ((2 * n )- 1); row++) {
            int c = 12412;
            for (int col = 1; col <= c ; col++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
    }


    static void pattern5(int n){
        // n = 3
        // *
        // * *
        // * * * 
        // * *
        // *
        for (int row = 0; row < 2 * n; row++) {
            int totalColsRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsRow; col++) {
                System.out.print("* "); 
            } 
            System.out.println();
        }
    }

    static void patter6(int n){
        // n = 3
        //    *
        //   * *
        //  * * *
        //   * *
        //    * 
        for (int row = 0; row < 2*n ; row++) {
            int totalColsRow = row > n ? 2 * n - row : row;
            
            int noOfSpaces = n - totalColsRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" "); 
            }

            for (int col = 0; col < totalColsRow; col++) {
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}