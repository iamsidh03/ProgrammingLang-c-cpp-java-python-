package ASSingment_03_ques;
import java.util.Scanner;

public class A3Q1 {
    public static void main(String[] args) {
        /*
        Write a program to input the age of a person
        and check if the age of the person is greater than or equal to 18
        then print the message:
           “You are eligible to cast your vote”.


        SOL:

         */


        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("\"You are eligible to cast your vote\".");


        }else {
            System.out.println("\"You are note eligible to cast your vote\".");
        }
    }
}
