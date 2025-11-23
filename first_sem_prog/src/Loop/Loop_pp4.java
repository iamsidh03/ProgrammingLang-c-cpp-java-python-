package Loop;
import java.util.Scanner;
public class Loop_pp4 {
    public static void main(String[] args) {
        /*
        Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
          (Do not use Java built-in method)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  base number ");
        int base = sc.nextInt();
        System.out.print("Enter  power number ");
        int pow = sc.nextInt();
        int power=1;
        for (int i=1;i<=pow;i++){
            power*=base;
        }
        System.out.println("power is "+power);
    }
}
