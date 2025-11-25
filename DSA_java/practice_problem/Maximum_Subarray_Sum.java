import java.util.*;

/* 
Array:
[-2, 1, -3, 4, -1, 2, 1, -5, 4]

Maximum subarray is:
[4, -1, 2, 1] → Sum = 6

1️ Keep adding elements to a running sum (currentSum).
2️ If currentSum becomes negative, reset it — start a new subarray.
3️ Track and update the maximum sum seen so far (maxSum) with its subarray boundaries.
*/
public class Maximum_Subarray_Sum {
    
    public static int[] kadaneAlgo(int[] arr,int n){
        int currentsum=arr[0],maxsum=arr[0];
        int start=0, tempstart=0,end=0;

        for(int i=1;i<n;i++){
            if(arr[i]>currentsum+arr[i]){
                currentsum=arr[i];
                tempstart=i;
            }
            else{
                currentsum+=arr[i];
            }
            if(currentsum>maxsum){
                maxsum=currentsum;
                start=tempstart;
                end=i;
            }
        }
        return Arrays.copyOfRange(arr, start,end+1);

    }
    public static void main(String[]args){
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array\n");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element ");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
        
        
          
         int[] res=kadaneAlgo(arr,size);
         int sum=0;
         for(int x:res){
            sum+=x;
         }
         System.out.println("elements are: "+Arrays.toString(res));
         System.out.println("\n sum of sub array is :"+sum);
         sc.close();
    }
}
