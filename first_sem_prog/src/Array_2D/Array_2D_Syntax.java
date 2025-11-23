package Array_2D;


import java.util.Scanner;

public class Array_2D_Syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter row of Array");
        int row =sc.nextInt();
        System.out.println(" Enter col of Array");
        int col =sc.nextInt();
        int [][]arr = new int[row][col];
        //input
        for (int rows = 0; rows <arr.length ; rows++) {
            //for each col in every row
            for (int cols = 0; cols < arr[row].length; cols++) {
                arr[rows][cols]=sc.nextInt();
            }
        }
        //output
        for (int rows = 0; rows <arr.length ; rows++) {
            //for each col in every row
            for (int cols = 0; cols < arr[row].length; cols++) {
                System.out.println(arr[rows][cols]+" ");
            }
            System.out.println();
        }
    }


}