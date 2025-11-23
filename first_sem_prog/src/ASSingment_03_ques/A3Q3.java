package ASSingment_03_ques;
import java.util.Scanner;

public class A3Q3 {
    public static void main(String[] args) {
        /*
        Write a program that reads three integers
        from the user and prints "Increasing"
        if the numbers are in increasing order, "Decreasing"
        if the numbers are in decreasing order
         , and "Neither increasing nor decreasing order" otherwise.
                Here is sample run:
        Input first number: 241
        Input second number:345
        Input third number: 4563
“Increasing”
        Input first number: 345
        Input second number:145
        Input third number: 563
“Neither Increasing nor decreasing”
        Input first number: 45
        Input second number:14
        Input third number: 3
“Decreasing”


         */


        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: " );
        float i = sc.nextFloat();
        System.out.print("Input 2nd number: ");
        float j = sc.nextFloat();
        System.out.print("Input first number: ");
        float k = sc.nextFloat();

        if (i>j && j>k ){
            System.out.println("decreasing");

        } else if (j>k && k>j &&j>i ) {
            System.out.println("increasing");

        } else  {
            System.out.println("\"Neither Increasing nor decreasing\"");

        }
    }
}
