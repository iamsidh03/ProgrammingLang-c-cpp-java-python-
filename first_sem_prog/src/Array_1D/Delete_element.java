package Array_1D;

import java.util.*;

public class Delete_element {
    public static int Search(int A[],int ele){
        int pos =-1;
        System.out.println(" enter size of element: ");
        for (int i=0;i<A.length;i++)
        {
            if (A[i] == ele)
            {
                pos =i+1;
                return pos;
            }
        }
        return pos;
    }
    public static void Display(int[]A){
        System.out.print(" Array element are ");
        for (int i=0;i<A.length;i++){
            System.out.print(" "+ A[i]+" ");
        }

    }
    public static void Delete(int A[],int pos,int ele){
        for (int i =0;i<A.length;i++){
            if (A[i] == ele)
            A[i]=0;
        }
        System.out.println(" Array elements after deletion ");
        Display(A);
       // for (int i = pos; i<A.length-1; i++){
         //   System.out.println(A[i]);
        //}
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Display the size of Array ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println(" Enter elements of array ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        Display(A);
        System.out.println(" Enter element to detete ");
        int ele = sc.nextInt();
        int p = Search(A, ele);
        if (p ==-1) {
            System.out.println(" element is not present ");
        } else {
            Delete(A,p,ele);
        }

    }
}
