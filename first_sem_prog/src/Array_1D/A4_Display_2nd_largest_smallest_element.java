package Array_1D;

import java.util.Scanner;

public class A4_Display_2nd_largest_smallest_element {
    public static void main(String[] args) {
        /*
        displlay the second largest and smallest number in the array
         */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[]=new int[size];

        for (int i =0;i<size;i++){
            System.out.println("Enter number at "+i+" index");
            number[i]=sc.nextInt();
        }
        for (int i=0;i<number.length;i++){
            for (int j =i+1;j<number.length;j++){
                if (number[i]>number[j]){
                    int temp = number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }


        }
        System.out.println(" second largest number is: "+number[1]);
    }


}
