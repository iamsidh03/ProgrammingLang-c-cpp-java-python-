package Array_1D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swap_an_Array {
    public static void main(String[] args) {
        int []arr = {1,3,43,23,41,3432};
        rev(arr,3,4);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int []arr,int index1,int index2){
             int temp   = arr[index1];
             arr[index1]=arr[index2];
             arr[index2]=temp;

    }
    static void rev(int arr[],int start,int end){
        start =arr[0];
        end =arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
