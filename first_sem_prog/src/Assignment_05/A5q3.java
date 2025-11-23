package Assignment_05;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class A5q3 {
    public static void main(String[] args) {
 /*
 WAP to enter the first number and second number.
  Display the prime numbers between the first and second number.
Sample run:
Enter the first number: 4
Enter the second number: 15
Prime numbers between 4 and 15 are: 5 7 11 13
  */
        //wrong output
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number ");
        int a =sc.nextInt();
        int b = sc.nextInt();
/*
        for (int i =a;i<=b;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if(i%j==0){
                    ++count;

                }
            }
            if (count==2){
                System.out.println(" prime numbers are "+i);
            }
        }

 */
        for (int i =a;i<=b;i++){
            int count =0;
            for (int j =2;j<=(int)Math.sqrt(i);j++){
                if (i%j==0){
                    count=1;
                }
            }
            if (count==0){
                System.out.println(" prime numbers are "+i);
            }
        }

    }
}
