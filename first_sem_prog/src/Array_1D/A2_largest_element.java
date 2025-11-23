package Array_1D;

import java.util.Scanner;


public class A2_largest_element {
    public static void main(String[] args) {
        /*
        Display the largest number in the array
         */

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] =new int[size];
        for (int i =0;i<size;i++){
            System.out.println("Enter number at "+i+" index");
            number[i]=sc.nextInt();
        }
        int max=number[0];
        for (int i=0;i<number.length;i++){
            if (number[i]>max){
                max=number[i];
            }

        }
        System.out.println("Largest number is: "+max);
    }
}
