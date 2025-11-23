package Assignment6;

import java.util.Scanner;

public class HA6Q1 {
    public static void main(String[] args) {
        /*
        Write a program to find the first non-repeated character in a given String,
        for example, if the given String is "Java" then the first non-repeated character is "J".
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        first(s);

    }
    public static void first(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            int c=0;
            for(int j=0;j<s.length();j++)
            {
                if(i==j)
                    continue;
                else if(ch!=s.charAt(j))
                    c++;
                else
                    break;
            }
            if(c==s.length()-1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
