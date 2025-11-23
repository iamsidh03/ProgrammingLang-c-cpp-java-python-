package Assignment6;
import java .util.Scanner;
public class A6Q3 {
    public static int reverse(int n){
        int rev=0;
        while (n!=0){
            int rem = n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;

    }
    public static boolean isPalindrome(int n){
        int rev= reverse(n);
        return (n==rev);
    }


    public static void main(String[] args) {
        /*
        Write the methods with the following headers
// Return the reversal of an integer. Example: reverse (456), returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome.
 A number is a palindrome if its reversal is the same as itself.
 . Write a java program that prompts the user to enter an integer and reports whether the integer is a palindrome.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the reeverse of "+n+ " is "+reverse(n));
        /*
        if (isPalindrome(n)) {
            System.out.println(n+" is palindrome number ");
        }else
            System.out.println(n +" not a palindrome number");

         */
        boolean r =isPalindrome(n);
        System.out.println(n+" is palindrome "+r);


    }
}
