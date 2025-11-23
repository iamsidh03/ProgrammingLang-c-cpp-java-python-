package Array_1D;

import java.util.Scanner;

public class Insert_element {
    public static void Display(int []A){
        System.out.print(" element of Array are: ");
        for (int i =0;i<A.length;i++){
            System.out.print(" "+A[i]+" ");
        }
        }
    public static void insert(int A[],int pos ,int ele){
        for (int i =(A.length-2);i>=pos-1;i--){
            A[i+1]=A[i];
            A[pos -1]=ele;
        }
        System.out.println(" After inserstion ");
        Display(A);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of element: ");
        int n = sc.nextInt();
        int []A =new int[n+1];
        for (int i =0;i<n;i++){
            System.out.print(" enter element: ");
            A[i]=sc.nextInt();
        }
        System.out.println(" Before swapping: ");
        Display(A);
        System.out.println();
        System.out.println(" Enter position to insert element ");
        int pos = sc.nextInt();
        int ele =sc.nextInt();
        insert(A,pos,ele);
    }
}
