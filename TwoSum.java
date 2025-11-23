import java.util.HashMap;
import java.util.*;
public class TwoSum {
    public static int[]  pairsum(int []arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int comp=target-arr[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(arr[i],i);
        }
        return  new int[]{0,0};
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
        System.out.println("Enter the target\n");
         int tar=sc.nextInt();

         int[] res=pairsum(arr, tar);
         System.out.println("Indieces are "+Arrays.toString(res));
         sc.close();
    }
}
