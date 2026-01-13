
package question;

import java.util.*;

public class microsoft_cyclicshort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,3,4,5,6,6};
        System.out.println(shorting(arr));
    }

    static List<Integer> shorting(int[] arr){
        int i = 0;
        while (i< arr.length) {
            int correct_index = arr[i] - 1;
            if(arr[i] != arr[correct_index]){
                swap(arr, i , correct_index);
            }else{
                i++;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index <  arr.length; index++){
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

}