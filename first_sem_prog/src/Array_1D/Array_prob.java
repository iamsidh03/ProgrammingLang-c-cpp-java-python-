package Array_1D;

import java.util.Scanner;

public class Array_prob {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int []arr =new int[100];

        System.out.println(" Enter the interger between 1 and 100 ");
        System.out.print(" (for exit press 0) ");
        int numm =sc.nextInt();
        while( numm!=0){
            if(numm>0&&numm<=100) {
               arr[numm]++;
            }
            numm = sc.nextInt();
        }
        for (int i = 1; i <100 ; i++) {
            if (arr[i]==1) {
                System.out.println(i+" occurs "+arr[i]+" time");
            }  else if (arr[i]>0){
                System.out.println(i+" occurs "+arr[i]+" times");
            }
        }
    }
}

