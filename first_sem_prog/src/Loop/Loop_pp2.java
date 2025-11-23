package Loop;
import java.util.*;

public class Loop_pp2 {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to input a positive integer.
         It should then print the multiplication table of that number.
         using for loop while loop and do while
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println("\"using for loop\"");
        int num = sc.nextInt();
        for(int i = 1; i<=10;i++)
        {
            System.out.println(num +" * " + i + " = " +num*i);
        }
        System.out.println();
        System.out.println("Enter a number");
        System.out.println("\"using While loop\"");


        //int num1 = sc.nextInt();
        int k =1;
        while(k<=9){         //exit controlled
            k++;
            System.out.println(num +" * " + k + " = " +num*k);

        }
        System.out.println();
        System.out.println("Enter a number");
        System.out.println("\"using Do-while loop\"");

        int j = 1;
        do{
            System.out.println(num +" * " + j + " = " +num*j);
            j++;
        } while (j<=10);


    }
}
