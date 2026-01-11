package question;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/

public class amazon_cyclicshort {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 4 };
        // sort(arr);
        amazon(arr);
        int missing = amazon(arr);
        System.out.println(missing);
        System.out.println(Arrays.toString(arr));
    }

    static int amazon(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct_index]) {
                swap(arr, i, correct_index);
            } else {
                i++;
            }
        }

        // search for first misiting no
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

}