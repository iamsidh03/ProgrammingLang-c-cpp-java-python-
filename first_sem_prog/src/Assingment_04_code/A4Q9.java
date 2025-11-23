package Assingment_04_code;

import java.util.Scanner;

public class A4Q9 {
    public static void main(String[] args) {
        /*
        Write a java program to take an integer input from the user and print the input by removing all zeros.
        Example: Input = 10200 then Output = 12.
Sample run:
Enter an integer number: 10203040
After removing 0 from number 10203040, the new number is 1234.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int r,nnum=0,id=0;
        while (num!=0){
            r=num%10;
            if (r!=0){
                nnum += r*(int)Math.pow(10,id);
                id++;
            }
            num=num/10;
        }
        System.out.println(" After removing all zeroes: "+ nnum);


    }
}
