package Assignment_05;

import java.util.Scanner;

public class A5Q10 {
    public static void main(String[] args) {
        /*
        Given a=0, b=1 and c=1 are the first three numbers of some sequence.
         All other numbers in the sequence are generated from the sum of their three most recent predecessors.
          Write a java program to generate this sequence up to n terms where n > 3.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        int n = sc.nextInt();
        int a =0, b=1,c=1,nextnum=0;
        System.out.print(a+" "+b+" "+c+" ");
        for (int i =4;i<=n;i++){
            nextnum=a+b+c;
            System.out.print(nextnum+" ");
            a=b;
            b=c;
            c=nextnum;
        }


    }
}
