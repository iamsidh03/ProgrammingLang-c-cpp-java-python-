package Assignment6;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class A6Q4 {
    public static int numberOfDays(int starting_date,int ending_date) {

        int count=0,noOfDays =0;

        for (int i = starting_date; i <= ending_date; i++) {

            if ((i%4==0&&i%100!=0)||(i%400==0)){
                count++;
            }
            noOfDays = (ending_date-starting_date)*365+count;
        }

        return noOfDays;
    }

    public static void main(String[] args) {
        /*
        Write a method that returns the number of days in a year using the following header:
public static int numberOfDaysInAYear(int year)
Write a java program that displays the number of days in year from 2000 to 2020.
Question-5:
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter starting year ");
        int sty= sc.nextInt();
        System.out.println(" enter ending year ");
        int eny = sc.nextInt();
        System.out.println("the number of days in  year from  "+sty+"to "+eny+": "+numberOfDays(sty,eny));



    }
}
