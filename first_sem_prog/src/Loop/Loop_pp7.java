package Loop;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Loop_pp7 {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to input a positive integer
        . It should then output a message indicating whether the number is a prime number.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag=0;
        for(int i = 2; i<=(int )(Math.sqrt(num));i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }if(flag!=0){
                System.out.println(num+" is  not prime");

            }else
                System.out.println(num+" is prime.");

        //Method 2
        int n,count=0;
        for (int k = 1; k<=num;k++)
        {
            if (num%k==0){
            count++;
        }
        }
        if(count ==2){
            System.out.println("Prime number");
        }else
            System.out.println("Not prime");


    }
}
