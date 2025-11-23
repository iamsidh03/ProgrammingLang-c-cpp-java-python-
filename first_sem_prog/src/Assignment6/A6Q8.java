package Assignment6;

import java.util.Scanner;

public class A6Q8 {
    public static boolean isPalindrome(String str){
        int length = str.length();
        for (int i =0;i<length/2;i++){
            if (str.charAt(i)!=str.charAt(length-1-i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        /*
        Write a java method to check a string is palindrome or not.
         */
       // String s = "racecar";
        //System.out.println(s.length()); //.lenth() method count number of character in that string.
         Scanner sc = new Scanner(System.in);
        System.out.println(" Enter string ");
         String str = sc.next();
         if (isPalindrome(str)){
             System.out.println(str+" Is a Palindrome string ");
         }
         else{
             System.out.println(str+" Not a Palindrome String ");
         }
    }
}
