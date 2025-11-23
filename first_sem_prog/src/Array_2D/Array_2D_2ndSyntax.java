package Array_2D;
import java.util.Scanner;
public class Array_2D_2ndSyntax {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
        */
        /*
        Scanner in = new Scanner(System.in);
        //int[][] arr = new int[3][];
          int []ar ={2,23,4};
           int[][] arr = {
                  {1, 2, 3}, // 0th index
                    {4, 5}, // 1st index
                  {6, 7, 8, 9} // 2nd index -> arr[2] = {6, 7, 8, 9}
            };

      //  int[][] arr = new int[3][3];
        System.out.println(arr.length);// no of rows
        System.out.println(arr);
        System.out.println(ar);
        // input

         */


                int[][] arr = {
                        {1, 2, 3, 4},
                        {5, 6},
                        {7, 8, 9}
                };

                for (int row = 0; row < arr.length; row++) {
                    for (int col = 0; col < arr[row].length; col++) {
                        System.out.print(arr[row][col] + " ");
                    }
                    System.out.println();
                }
            }
    }

