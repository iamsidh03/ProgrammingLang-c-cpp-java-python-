import java.util.*;

/* 
array of n + 1 integers where each integer is in the range 1 to n (inclusive)
n + 1 numbers but only n possible values, at least one number must be duplicated.
find and return the duplicate number
Input: arr = [1, 3, 4, 2, 2]
Duplicate number: 2
Output: 2
*/
public class FindDuplicateNumber {
    
    public static int duplicateUsingMap(int []arr,int n){
        /* 
        Approach 
        store each element with their frequency
        again iterate over this and check if the frequency is greater then 1 then return that element 
        TC:O(n)
        SC:O(n)
        */
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>1){
                return i;
            }

        }
        return -1;
        

    }
    public static int duplicateUsingSet(int[] arr, int n){
        /* 
        store element in set and check if that elememnt is present in the set then it is duplicate element 

        */
       HashSet<Integer> set= new HashSet<>();

       for(int i:arr){
        if(set.contains(i)){
            return i;

        }
       }
       return -1;
    } 
    public static int cycleDetection(int[] arr, int n){
        // Every number in the array points to another index.

        int slow=arr[0];
        int fast=arr[0];

    //    while(fast!=slow){
    //     slow=arr[slow];
    //     fast=arr[arr[fast]];
    //    } becaouse both pointer start at the same point so loop need to run first

        do {
        slow = arr[slow];
        fast = arr[arr[fast]];
        } while(slow != fast);
       fast=arr[0];
       while(fast!=slow){
        slow=arr[slow];
        fast=arr[fast];
       }
        return slow;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the element");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        
        System.out.println("\nChoose Method:");
        System.out.println("1. Using HashMap");
        System.out.println("2. Using Sorting");
        System.out.println("3. Using Floyd’s Cycle Detection");
        System.out.print("Enter your choice: ");
        int ch=sc.nextInt();
        int result=-1;
        switch (ch) {
            case 1:
                result=duplicateUsingMap(arr, n);
                break;
            case 2:
                result=duplicateUsingSet(arr,n);
                break;
            case 3:
                result=cycleDetection(arr,n);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
                break;
        }
        if(result!=-1)

          System.out.println("Duplicate Number Found: " + result);
        else
            System.out.println("No duplicate present!");
        sc.close();
    }
}
