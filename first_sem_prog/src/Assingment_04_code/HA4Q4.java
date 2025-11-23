package Assingment_04_code;

import java.util.Scanner;

public class HA4Q4 {
    public static void main(String[] args) {
        /*
        Write a java program to print the sum of all even numbers and the product of all odd numbers from 1 to N. Where, N is the input to the program.
For input, N = 10 Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30 Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945
         */

        //complete
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0,prod=1;
    for (int i =1;i<=n;i++){
        if(i%2==0){
            sum=sum+i;

        }
        else{
            prod*=i;
        }
    }
        System.out.println(sum);
        System.out.println(prod);
    }
}
