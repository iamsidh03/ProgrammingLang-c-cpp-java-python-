package Assignment_05;

import java.util.Scanner;

public class A5Q8 {
    public static void main(String[] args) {
        /*
        WAP to enter the value of n and display find the following sum of the series:
1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1;i<=n;i++){
            for (int k =1;k<=i;k++){
                sum+=k;
            }

        }
        System.out.println(" the sum is "+sum);
    }
}
