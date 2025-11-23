package Loop;

import java.util.Scanner;

public class Loop_pp9 {
    public static void main(String[] args) {
        /*
        Write a program to enter the numbers till the user wants
         and at the end the program should display the largest and smallest numbers entered.
         */
        Scanner sc = new Scanner(System.in);

        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;
        do{
            System.out.println(" Enter the number: ");
            int num = sc.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            System.out.println(" Do you wany to continue: y/n ");
            choice = sc.next().charAt(0);

        } while (choice=='y'||choice=='Y');
        if(choice!='y'||choice!='Y'){
            System.out.println("OK! it's Fine");
        }
        System.out.println("MAX VALVUE: "+max);
        System.out.println("MIN VALUE: "+min);

    }
}
