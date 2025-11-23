package Assingment_04_code;
import java.util.*;

public class A4Q8 {
    public static void main(String[] args) {
        /*
        Write a program that generates a random integer number between 1 to 10
         and asks the user to guess what the number is
            . If the user's guess is higher than the random number,
             the program should display "Too high, try again."
              If the user's guess is lower than the random number,
               the program should display "Too low, try again."
               The program should use a loop that repeats until the user correctly guesses the random number and display good guess.
         */
        Scanner sc = new Scanner(System.in);
        int ug,cg;
        Random rn =new Random();
        System.out.print("user guess: ");
        ug= sc.nextInt();

        cg= rn.nextInt(10);
        System.out.println(" computer guess: "+cg);


        do {
            if (ug > cg) {
                System.out.println("\"Too high, try again.\"");
            } else if (ug < cg) {
                System.out.println("\"Too low, try again.\"");
            } else {
                System.out.println("\"good guess\"");
            }
        }while(ug!=cg);




    }
}
