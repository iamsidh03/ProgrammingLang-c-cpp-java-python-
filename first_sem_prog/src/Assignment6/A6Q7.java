package Assignment6;

import java.util.Scanner;

public class A6Q7 {
    public static int count(String str){
        String vowel ="aeiouAEIOU";
        int count=0;
        for (int i=0;i<str.length();i++){
            for (int j=0;j<vowel.length();j++) {
                if (str.charAt(i) == vowel.charAt(j))
                    count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        /*
        Write java method called count accepts a string as input and returns the number of vowels in it. The method header is given below.
public static int count(String str)
For example, count ("Welcome") returns 2.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter string ");
        String str = sc.nextLine();
        System.out.println(" \"Number of vowel in "+str+" is "+count(str)+" \"");

        
    }
}
