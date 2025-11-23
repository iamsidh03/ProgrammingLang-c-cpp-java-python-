package Assignment6;

import java.util.Scanner;

public class A6Q9 {
    public static boolean isValid(String p) {
        boolean res = false;
        int nd = 0;
        if (p.length() > 8) ;
        for (int i = 0; i < p.length(); i++) {           //equal to nahi lagana hai

            if (!Character.isLetterOrDigit(p.charAt(i))) {
                return false;
            }
        }
        for (int i = 0; i < p.length(); i++) {          //equal to nahi lagana hai
            if (Character.isDigit(p.charAt(i))) {
                nd++;
            }
        }
        if (nd >= 2) {
            res = true;
        }


        else {
            return false;
        }

        return res;
    }

    public static void main(String[] args) {
        /*
        Some websites impose certain rules for passwords.
Write a method that checks whether a string is a valid password.
 Suppose the password rules are as follows:
   A password must have at least eight characters.
    A password consists of only letters and digits.
     A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed or Invalid Password otherwise.
         */
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter password ");
        String p =sc.next();
        boolean r=isValid(p);
        System.out.println(" password is " + (r?"is valid":" not a valid password"));



    }
}
