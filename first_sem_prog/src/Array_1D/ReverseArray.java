package Array_1D;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeee = sc.nextInt();
        int []A=new int[sizeee];
        int k=A[0],j=A.length-1,temp;
        for(int i = 0;i<A.length;i++){
            System.out.println("enter element ");
            A[i]=sc.nextInt();
        }
        while (k>j){
            temp=A[k];
            A[k]=A[j];
            temp=A[k];
            k++;
            j--;
            System.out.println(A[k]);
        }


    }



}
