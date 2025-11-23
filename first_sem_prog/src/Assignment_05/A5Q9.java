package Assignment_05;

import java.util.Scanner;

public class A5Q9 {
    public static void main(String[] args) {
        /*
        Write a program that will read the value of n from the user and calculate sum of the following series:
1/1^2 + 1/2^2 + 132 + 142+ ... + 1𝑛2.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum =0;

        for (int i =1;i<=n;i++){
            sum+=1/Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
