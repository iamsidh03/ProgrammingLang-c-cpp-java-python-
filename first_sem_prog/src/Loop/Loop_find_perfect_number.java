package Loop;

import java.util.Scanner;

public class Loop_find_perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int cnum=0;
        for(int i =1;i<=num/2;i++){
            if(num%i==0){
                cnum+=i;

            }
        }
        if(cnum%num==0){
            System.out.println("perfect number");
        }else {
            System.out.println(" not perfect number");
        }

        //using while
        System.out.println("using while loop");
        int b= sc.nextInt();
        int sum=0;
        for (int k=1;k<=b/2;k++){
            if(b%k==0){
                sum+=k;
            }
        }if(sum%b==0){
            System.out.println("perfect number");
        }else {
            System.out.println(" not perfect number");
        }
    }
}
