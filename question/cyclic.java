package question;
import java.util.*;

public class cyclic {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(cyclic(arr)));
    }

    static int[] cyclic(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct_index = arr[i] - 1;
            if (arr[i] != arr[correct_index]) {
                swap(arr, i , correct_index);
            }else{
                i++;
            }
        }

        for(int index = 0; index< arr.length; index ++){
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index + 1};
            }
        }

        return new int[] {-1, -1};
    }

    static void swap(int[] arr , int first , int sec){
        int t = arr[first];
        arr[first] = arr[sec];
        arr[sec] = t;
    }
}