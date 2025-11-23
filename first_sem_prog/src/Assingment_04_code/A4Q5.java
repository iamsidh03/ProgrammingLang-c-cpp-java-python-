package Assingment_04_code;
import java.util.*;
public class A4Q5 {
    public static void main(String[] args) {
        /*
        Write a Java program to check if a number is perfect number or not.
(Hints: A number N is called perfect number, if the sum of factors except N as a factor is
equals to the number N.)
Example:
N = 28 is a perfect number as (1 + 2 + 4 + 7 + 14 = 28.)
Sample run1:
Enter a number: 496
496 is a perfect number.
Sample run2:
Enter a number: 490
490 is not a perfect number.
Question-
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int sum = 0,Sum=0;

        for(int i = 1;i<n;i++) {

            if(n%i==0){
                sum+=i;


            }
        }System.out.print(" " +sum);
        if(sum==n){
            System.out.println(" is a perfect number");
        }else{
            System.out.println(" not a perfect number");
        }


        int j=1;
        while (j<=n/2) {
            if (n % j == 0) {
                Sum = Sum + j;
                break;
            }
            j++;
        }
            if(sum==n){
                System.out.println(" is a perfect number");
            }else
                System.out.println(" not a perfect number ");
        }



    }

