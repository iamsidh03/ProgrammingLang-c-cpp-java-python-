package Array_1D;

import java.util.Scanner;

public class Even_odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array ");
        int Size = sc.nextInt();
        int A[]=new int[Size];
        for (int i =0; i<A.length;i++){
            System.out.println(" enter the element at "+ i+ " index ");
            A[i]=sc.nextInt();

        }
for (int i = 0 ; i<A.length;i++){
    if (A[i]%2==0){
        System.out.println(A[i]+" is even number ");
    }else
        System.out.println(A[i]+" is odd number ");


}


    }
}
