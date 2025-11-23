package Assingment_04_code;
import java.util.*;
public class A4Q2 {
    public static void main(String[] args) {
        /*
        An integer n is divisible by 9 if the sum of its digits is divisible by 9.
         Use this concept in your program to determine whether or not the number is divisible by 9.
         Test it on the following numbers: Use while loop.
n = 123456
n = 154368
n = 621594

Hint: Use the % operator to get each digit; then use / operator to remove the digit.
Sample run 1:
Enter a number: 154368
The number 154368 is divisible by 9.
Sample run 2:
Enter a number: 123456
The number 123456 is not divisible by 9.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while (n>0) { //145       //14     //1    //0>0=false-->out from loop
            int a = n % 10;  //5   //4     //1
            sum += a;   //0+5       //5+4   //10
            n /= 10;    //14         //1     //0
        }
            if(sum%9==0){
                System.out.println("number is divisible by 9");

            }else {
                System.out.println("Number is not divisible by 9");
            }
        System.out.println("\n");
        System.out.println("\"using For loop\"");
        System.out.println("\n");
            int Sum=0;
            for(;n>0;){
                int b = n%10;
                Sum+=b;
                n/=10;
            }
        if(sum%9==0){
            System.out.println("number is divisible by 9");

        }else {
            System.out.println("Number is not divisible by 9");
        }
        }

    }

