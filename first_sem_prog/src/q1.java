
//sum of three digit number
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter  digit number");
        int num = sc.nextInt();

        int a =num%10;
         num =num/10;
         int b= num%10;
         num=num/10;
         int sum = a+b+num;
        System.out.println(sum);


    }
}
