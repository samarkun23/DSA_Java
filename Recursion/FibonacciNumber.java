
package Recursion;

public class FibonacciNumber {

    // find nth fibonacci number . 
    // fibonacci numbers : 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 .........
    // so Fibo (N^th) = f(N-1) + f(N - 2) , got this from common sense 
    // now if we need fibo(5) = fibo(4) + fibo(3) 
    // now fibo(4) call it's self = fibo(3) + fibo(2)
    // now 3 do same thing and 2 do the same thing ex fibo(2) = fibo(1) + fibo(0)
    // base condition : 1 or 0 
    public static void main(String[] args) {
        System.out.println(fibo(6)); 
    }    

    static int fibo( int n ){

        if ( n < 2 ) {
            return n; 
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}