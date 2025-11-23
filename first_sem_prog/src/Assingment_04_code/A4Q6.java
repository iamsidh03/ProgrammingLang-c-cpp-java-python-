package Assingment_04_code;
import java.util.*;
public class A4Q6 {
    public static void main(String[] args) {
        /*
        Write a java program to enter two numbers through the keyboard.
         Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method).
Sample run:
Enter the base: 5
Enter the power: 4
5 to the power 4 is: 625
Question-7:
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base number");
        int b = sc.nextInt();
        System.out.println("Enter power number");
        int p = sc.nextInt();
        int m=1;
        for (int i=1;i<=p;i++) {
             m = m*b;
        }
        System.out.println(m);

    }



}

