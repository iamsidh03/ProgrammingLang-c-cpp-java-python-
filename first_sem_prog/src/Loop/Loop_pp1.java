package Loop;
import java.util.Scanner;
public class Loop_pp1 {
    public static void main(String[] args)
    {
        /*
        Write a program to calculate the sum of first nth  natural number. using for loop,while loop, do-while loop
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println("\"using for loop\"");
        int num = sc.nextInt();
        int sum = 0;


        for (int i =0;  i <= num; i++)
        {
            //System.out.print(i);
            sum = sum + i;

        }
        System.out.print(sum);
        System.out.println();
        System.out.println("Enter a number");
        System.out.println("\"using While loop\"");


        int num1 = sc.nextInt();
         int k =0,sum1=0;
        while (k <= num1) {

             sum1 = sum1+k;
            k++;


        } System.out.println(sum1);

        System.out.println();
        System.out.println("Enter a number");
        System.out.println("\"using Do-while loop\"");
       int num2 = sc.nextInt();
        int j = 1,sum2=0;
        do{
            sum2+=j;
            j++;
        }
        while (j<=num2);
        System.out.println(sum2);

    }




    }

