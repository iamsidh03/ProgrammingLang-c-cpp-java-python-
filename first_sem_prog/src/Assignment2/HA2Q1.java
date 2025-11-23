package Assignment2;
import java.util.Scanner;
public class HA2Q1 {
    public static void main(String[] args) {
       /* Write a java program that prompts the user to enter the minutes
        (e.g., 1 billion), and displays the number of years and days for the minutes.
        For simplicity, assume a year has 365 days.
                Here is a sample run:
        Enter the number of minutes: 1000000000
        1000000000 minutes is approximately 1902 years and 214 days.

                //Solution

        */
                Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long year =min/(60*24*365);
        long days = (min%(60*24*365))/(60*24);
        System.out.println(year+"\t"+days);

    }
}
