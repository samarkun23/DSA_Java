
package Recursion;

public class Binary {

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 4;
        System.out.println(RecursionSearch(arr, target, 0, arr.length));
    } 

    static int RecursionSearch(int[] arr , int target , int s , int e){
        // int s = 0;
        // int e = arr.length - 1;

        if(s > e){
            return -1;
        }

        int m = s + (e-s)/2;

        if(arr[m] == target) {
            return m;
        }

        if(target < arr[m]){
            return RecursionSearch(arr, target, s, m - 1);
        }
        
        return RecursionSearch(arr, target, m+1, e);

        // RecursionSearch(arr, target); // now you want to divide arr in half in the recursion function you have to divide this array into half in the sub recursin function bec you applying recurstion , you cannot do it right now 
        // so the question is how do i pass this start and end into the feature methods ? how i pass ? only 1 way to do it put it inside the argument   
    }

}