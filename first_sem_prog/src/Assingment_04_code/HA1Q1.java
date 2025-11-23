package Assingment_04_code;

import java.util.Scanner;

public class HA1Q1 {
    public static void main(String[] args) {
        /*
        Write a java program to find the difference between the sum of the squares of the first ten natural numbers and the square of the sum.
The sum of the squares of the first ten natural numbers is: 1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 + 9^2 + 10^2 = 385
The square of the sum of the first ten natural numbers is: (1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
         */
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ssum=0,Sum,sums=0,sum=0;
        for(int i = 1;i<=n;i++){
            ssum= ssum+i*i;
        }
        System.out.println( "The square of sum of "+n+" is: "+ssum);
        for(int i = 1;i<=n;i++){
            sum+=i;
            sums=sum*sum;
        }
        System.out.println("The  sum of square of "+n+" is: "+sums);
        System.out.println("Hence the difference between the sum of the squares of"+ n +"numbers and the square of the sum is "+(sums-ssum));

    }
}
