import java.util.*;
/* 
[1, 2, 3, 4, 5]
k=2
[4, 5, 1, 2, 3]


*/
public class RotateElementByK {

    public static int[] RotateWithExtraSpaceLeft(int[]arr,int n,int k){
        
        
        int []res=new int[n];
        
        for(int i=0;i<n;i++){
            res[i]=arr[(i+k)%n];
        }
        return res;
    }
    public static int[] RotateWithExtraSpaceRight(int[]arr,int n,int k){
        
        
        int []res=new int[n];
        
        for(int i=0;i<n;i++){
            int idx=(i+k)%n;
            res[idx]=arr[i];
        }
        return res;
    }

    /* 
    Approach 2:
    reverse array
    reverse upto k
    reverse from k+1 to end
    */
      public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate array by K using reverse algorithm
    public static void rotate(int[] arr, int n, int k) {
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size\n");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k to rotate");
        int k=sc.nextInt();

        int[] resLeft=RotateWithExtraSpaceLeft(arr,n,k);
        int[] resRight=RotateWithExtraSpaceRight(arr,n,k);
        System.out.println("after rotation element is "+ Arrays.toString(resLeft));
        System.out.println("after rotation element is "+ Arrays.toString(resRight));
        sc.close();
    }
}
