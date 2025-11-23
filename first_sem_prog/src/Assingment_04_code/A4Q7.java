package Assingment_04_code;
import java.util.Scanner;
public class A4Q7 {
    public static void main(String[] args) {
        /*
        Write a java program to print the multiplication table of a number entered by the user
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int mult=1;
        for(int i=1;i<=10;i++){
            mult =n*i;
            System.out.println(n +" * "+i + " = " +mult);
        }

    }
}
