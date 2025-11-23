package Assingment_04_code;
import java.util.Scanner;
public class A4Q1 {
    public static void main(String[] args) {
        /*
        Write a java program that gets three integer numbers from the user.
         Count from the first number to the second number increments by the third number.
          Use for loop to do it. Also, display the sum of numbers displayed between the first number and second number.
Sample run:
Enter first number: 4 Enter second number: 13 Enter third number: 3
 4 7 10 13
The sum of number displayed is 34
Question-2:
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n = sc.nextInt();
        System.out.println("Enter second number:");
        int k = sc.nextInt();
        System.out.println("Enter Third number:");
        int j = sc.nextInt();

        int sun=0;
        for(int f=n;f<=k;f+=j){

            System.out.print(" "+f+" ");
         sun+=f;
        }
        System.out.println( " the sum is "+sun);




    }
}
