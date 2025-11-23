package Assignment2;

import java.util.Scanner;

public class A2Q4 {
    public static void main(String[] args) {
        /*
        Write a java program that reads an integer
         between 0 and 1000 and adds all the digits in the integer.
          For example, if an integer is 749, the sum of all its digits is 20.
Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
For instance, 749 % 10 = 9 and 749 / 10 = 74.
Here is a sample run:
Enter a number between 0 and 1000: 999 The sum of the digits is 27
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a= x%10;
        int b = (x/10)%10;
        int c =x/100;
        System.out.println(a+b+c);
    }
}
