package Loop;
import java.util.*;
public class Loop__pp8 {
    public static void main(String[] args) {
        /*
        Write a program to calculate HCF of Two given number.
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g=0;
        for (int i = 1;i<=a;i++){
            if (a%i==0&&b%i==0){
                g=i;
            }
        }
        System.out.println("HCF: "+g);

    }
}
