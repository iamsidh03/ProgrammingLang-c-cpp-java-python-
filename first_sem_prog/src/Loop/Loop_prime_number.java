package Loop;

import java.util.Scanner;

public class Loop_prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int flag=0;
        for(int i=2;i<=(int)(Math.sqrt(num));i++){
            if(num%i==0)
                flag=1;

        }if(flag!=0)
            System.out.println("Not a prime number");
        else
            System.out.println(" Prime number");
    }
}
