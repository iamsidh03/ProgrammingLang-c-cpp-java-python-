package Assignment_05;

import java.util.Scanner;

public class HA5Q3 {
    public static void main(String[] args) {
        /*
        Write a java program to evaluate the function sin(x) as defined by the infinite series expansion.
         sin (x) = x- 𝑥^3/3! + 𝑥^5/5! - 𝑥^7/7!+ +…
The acceptable error for computation is 10-6.
         */
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println(" enter value of x ");
        double x = a*Math.PI/180;
       double tsv = Math.sin(x);
       int s =1,deno =1,i=1;
       double osv=x, term =x;
       do {
           s=s*-1;
           deno = deno*(2*i)*(2*i+1);
           term =term *x*x;
           osv=osv +s*term/deno;
           i++;
       }while(Math.abs(tsv-osv)>=0.000001);
        System.out.println(osv);



    }
}
