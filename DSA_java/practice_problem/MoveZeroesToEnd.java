/* 
arr = [0, 1, 0, 3, 12]
o/p  [1, 3, 12, 0, 0]

*/

import java.util.*;

public class MoveZeroesToEnd{
    
    public static int[] movezero(int[]arr){
            /* count 0 and 1 */
    }
    public static void main(String[]args){
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array\n");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element ");

        
        

         int[] res=movezero(arr);
         System.out.println("Indieces are "+Arrays.toString(res));
         sc.close();

    }
}