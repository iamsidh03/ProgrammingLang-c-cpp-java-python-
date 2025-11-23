package Array_1D;

import java.util.Scanner;

public class A3_Smallest_number {
    public static void main(String[] args) {
        /*
        display the smallest number in the array
         */
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the size of array ");
        int size = sc.nextInt();
        int number[]=new int[size];


        for (int i =0;i<size;i++){
            System.out.println(" enter number at "+i+" index ");
            number[i]=sc.nextInt();
        }
        int min=number[0];
        for (int i=0;i<number.length;i++){
            if (number[i]<min){
                min=number[i];
            }
        }
        System.out.println("Smallest number is: "+min);

    }
}
