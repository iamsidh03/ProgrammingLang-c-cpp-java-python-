package ASSingment_03_ques;
import java.util.Scanner;


public class A3Q2 {
    public static void main(String[] args) {
        /*
        Alice visited SUM hospital to get treatment for her fever and illness.
        Doctor advised her to drink at least 5000 ml of water each day.
                Alice drank x ml of water today.
        Write a program that print the following message depending on the value of x.
          “Yes, Alice is following doctor’s advice”
        OR
            “No, Alice is not following doctor’s advice”

            Sol^n:
         */


        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();

        if (x>=5000){
            System.out.println("\"yes, Alice is following doctor's advice\"");
        }
        else {
            System.out.println("\"No, Alice is following doctor's advice\"");
        }
    }
}
