package Assignment_05;

import java.util.Scanner;

public class HA5Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0,b=1;
        int sum =0;
        for (int i =2; i<=n;i++){
             sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;


        }

    }
}
