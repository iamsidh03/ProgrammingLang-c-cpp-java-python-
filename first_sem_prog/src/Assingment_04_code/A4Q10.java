package Assingment_04_code;

import java.util.Scanner;

public class A4Q10 {
    public static void main(String[] args) {
        /*
        Write a java program to print largest power of three less than or equal to N.
Sample run:
Enter a number: 100
The largest power of 3 less than or equal to 100 is 81
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
/*
        for(int i = 1;i<=n;i++){
             i=3*i;
            System.out.println(i/3);
        }

 */
        int i = 1;
        while (i<=n){
            i=i*3;
            //i++;
        }
        System.out.println(i);

    }
}
