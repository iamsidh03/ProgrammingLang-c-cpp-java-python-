package Assignment6;

import java.util.Scanner;

public class A6Q1 {

    public static int addition(int x, int y) {
        int add = x + y;
        System.out.println(" the addition is "+add);
        return add;
    }

    public static int subtraction(int x, int y) {
        int sub = x - y;
        System.out.println(" the subtraction is "+sub);
        return sub;
    }
    public static int multiplication(int x , int y) {
        int multi = x * y;
        System.out.println( " the multiplication is "+multi);
        return multi;
    }
    public static int division(int x,int y) {
        int div = x / y;
        System.out.println(" the division is "+div);
        return div;
    }
    public static int remainder(int x,int y) {
        int rem = x % y;
        System.out.println(" the remainder is "+rem);
        return rem;
    }
    public static int sqrt(int x , int y ) {
        double sqx = Math.sqrt(x);
        double sqy = Math.sqrt(y);
        System.out.println(" root of x is " + sqx + "\n and root of y is " + sqy);
        return 2;
    }



    public static void main(String[] args) {
        /*
        Design a Simple Calculator using methods
         in java containing the following functionalities,
          namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The signature of the methods are given below.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number ");
        int y = sc.nextInt();
        addition(x,y);
        subtraction(x,y);
        multiplication(x,y);
        remainder(x,y);
        division(x,y);
        sqrt(x,y);


    }
}
