package Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class A1_find_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int size = sc.nextInt();
        int number[] =new int[size];
        int sum=0;
        for (int  i =0;i<size;i++){
            System.out.println("enter number at "+i+" index");
             number[i]=sc.nextInt();
        }
        for (int i =0;i<number.length;i++){
            sum+=number[i];

        }
        System.out.println(" sum of array is: "+sum);
        System.out.println("  average of array is: "+(float)(sum/size));
        System.out.println(Arrays.toString(number));
    }

}
