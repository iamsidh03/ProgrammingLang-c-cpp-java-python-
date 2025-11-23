package Array_1D;

import java.util.Scanner;

public class A1_Find_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int number[]= new int[size];
        for (int i=0;i<size;i++){
            System.out.println("enter "+i+" number to create an array");
             number[i]=sc.nextInt();
        }
        System.out.print("enter number user what to search for: ");
        int x = sc.nextInt();
        for (int i =0;i<size;i++) {
            if (number[i] == x) {
                System.out.println(x + " found at index " + i);
            }
            else if (number[i] != x) {
                System.out.println(x + " is not found in the given array ");
            }

        }


        }
    }

