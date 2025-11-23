package Assignment_05;

import java.util.Scanner;

public class A5Q4 {
    public static void main(String[] args) {
      /*
      WAP to calculate and display the factorial of all numbers between m and n (where m < n, m > 0, n > 0)
Sample run:
Enter the value of m: 2
Enter the value of n: 5
Factorial of 2 is: 2
Factorial of 3 is: 6
Factorial of 4 is: 24
Factorial of 5 is: 120
       */
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        for (int i = a;i<=b;i++){
            int fac=1;
            for (int j=1;j<=i;j++){
                fac*=j;
                System.out.println("factorial between "+j+" is "+fac);
            }

        }
    }
}
