//You have given an array of length l you hava to subtract -2 from each element of array when you backtrack
/**
 * ArrayBacktrack
 */
public class ArrayBacktrack {

    public static void main(String[] args) {
        int arr[]=new int[50];
        changeArr(arr,0,1);
        printArr(arr);


    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void changeArr(int []arr,int i,int val){
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;

    }
}