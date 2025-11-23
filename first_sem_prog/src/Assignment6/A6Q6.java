package Assignment6;

import java.util.Scanner;

public class A6Q6 {
    public static void main(String[] args) {
        /*
        Write a method that
        finds the number of occurrences of a specified character in a string using the following header:
public static int count(String str, char a)
For example, count ("Welcome", 'e') returns 2.
Write a java program that prompts
 the user to enter a string followed by a character and displays the number of occurrences of the character in the string. Question-7:
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter string ");
        String str = sc.nextLine();
        System.out.println(" enter character ");
        char ch =sc.next().charAt(0);
        System.out.println("The number of occurrences of \'" + ch +"\' in \"" + str + "\" is " + count(str,ch));


    }
    public static int count(String str , char a){
       int count=0;
        for (int i=0;i<str.length();i++){    //equal to(=) nahi laga na hai
            if (str.charAt(i)==a)
                count++;
        }
        return count;


    }
}
