package Loop;
import java.util.*;
public class Loop_pp6 {
    public static void main(String[] args) {
        /*
        Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
         */

       /* Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a number");
        // int num = sc.nextInt();
        int evensum = 0, oddsum = 0;
        char choice; char y=0,Y=0;
        do {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evensum += num;
            } else {
                oddsum += num;
            }
            System.out.println("Do you want to continue Y/N: ");
             choice = sc.next().charAt(0);
        }
        while (choice == y || choice == Y) ;
            System.out.println("Even Sum is: " + evensum);
            System.out.println("Odd Sum is: " + oddsum);


    }
}

        */



        Scanner console = new Scanner(System.in);

        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}




