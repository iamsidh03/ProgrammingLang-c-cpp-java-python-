package ASSingment_03_ques;
import java.util.Scanner;

public class A3HQ2 {
    public static void main(String[] args) {
        /*
        Write a java program that prompts the user to enter an integer for today’s day
         of the week (Sunday is 0, Monday is 1… and Saturday is 6).
         Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
Here is a sample run:
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
Enter today's day: 0 Enter the number of days elapsed since today: 31
Today is Sunday and the future day is Wednesday
         */
    Scanner sc =new Scanner(System.in);
        System.out.print("Enter today's day (0-6): ");
        int d = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int e = sc.nextInt();
        int futureDay =(d+e)%7;

        if(d==0){
            System.out.println("Today is Sunday"+futureDay);
        }
        else if (d==1){
            System.out.println("Today is Monday"+futureDay);
        } else if (d==2){
            System.out.println("Today is Tuesday"+futureDay);
            }else if (d==3){
            System.out.println("Today is Wednesday"+futureDay);
        }
        else if(d==4){
            System.out.println("Today is thursday"+futureDay);
        }
        else if(d==5){
            System.out.println("Today is friday"+futureDay);
        }
        else if(d==6){
            System.out.println("Today is saturday"+futureDay);
        }


        }


    }


