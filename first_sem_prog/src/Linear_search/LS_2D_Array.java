package Linear_search;

import java.util.Arrays;

public class LS_2D_Array {
    public static void main(String[] args) {
        int[][]arr={{55,46,97},
                    {897,21,86},
                    {8,89,22,54}
            };
        int target =86;
        int []ans =search(arr,target);
        //format of return value {row,col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(sum(arr));
    }
    static int[] search(int[][]arr, int target){
        for (int row=0;row<arr.length;row++){
            for (int col =0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};

                }

            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][]arr){
        int max=arr[0][0];
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (arr[row][col]>max){
                   max= arr[row][col];
                }

            }
        }
        return max;
    }
    static int min(int arr[][]){
        int min =arr[0][0];
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if (arr[row][col]<min){
                    min=arr[row][col];
                }

            }

        }
        return min;
    }
    static int sum(int arr[][]){
        int sum=0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                sum+=arr[row][col];
            }

        }
        return sum;
    }
}
