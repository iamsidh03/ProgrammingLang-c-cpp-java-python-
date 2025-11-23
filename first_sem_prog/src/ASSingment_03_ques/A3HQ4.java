package ASSingment_03_ques;
import java.util.*;
public class A3HQ4 {
    public static void main(String[] args) {
        /*
        Write a java program that prompts the user to enter an integer and determines
        whether it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
Here is a sample run of this program:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? True
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int i = sc.nextInt();
        if(i/5==0&&i/6==0){
            System.out.println("true");

            }
        }

    }

