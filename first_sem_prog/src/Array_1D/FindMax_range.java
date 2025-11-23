package Array_1D;

public class FindMax_range {
    public static void main(String[] args) {
        int []arr ={1,3,5,2,65};
        System.out.println(maxRange(arr,1,3));
    }
    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (start > end) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
