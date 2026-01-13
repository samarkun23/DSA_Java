package question;

//https://leetcode.com/problems/find-the-duplicate-number/

import java.util.*;

public class amazon_cyclicshort1 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,4};
        System.out.println(findMissing(arr));
    }

    static int findMissing(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                if (i != correct_index) {
                    return arr[i];
                }
                i++;
            }
        }

        // int ans = -1;
        // for (int index = 0; index < arr.length; index++) {
        //     if (arr[index] != index + 1) {
        //         ans = index - 1;
        //         break;
        //     }
        // }

        return -1;
    }

    static void swap(int[] arr, int first , int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

}