package Assignment_05;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class A5Q2 {
    public static void main(String[] args) {
        /*
        WAP to check whether a number is twisted prime or not.
        Twisted prime is a number if the number and its reverse both are prime then it is called twisted prime.
Sample run 1:
Enter a number: 97
97 is twisted prime.
Sample run 2: 43
43 is not a twisted prime
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem=0,rev=0;
        int count=0,countr=0;
while(n!=0) {
    rem = n % 10;
    rev = rev * 10 + rem;
    n /= 10;


} System.out.println(rev);
        for (int i=2;i<=(int)Math.sqrt(n);i++){
            if (n%i==0){
                count=1; //not prime
                break;
            }
        }

        for (int i=2;i<=Math.sqrt(rev);i++){
            if (rev%i==0){
                countr=1;  //not prime
                break;
            }
        }
        if (count!=countr){
            System.out.println(" not Twisted prime number ");
        }
        else{
            System.out.println(" Twisted prime ");
        }



    }
}
