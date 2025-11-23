package ASSingment_03_ques;
import java.util.*;
public class A3HQ3 {
    public static void main(String[] args) {
        /*
        Write a java program that randomly generates an integer
         between 1 and 12 and displays the English month name January, February… December for the number 1, 2… 12, accordingly.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number(1-12): ");
        int M= sc.nextInt();
        switch (M){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("feburary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octuber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
        }

    }
}
