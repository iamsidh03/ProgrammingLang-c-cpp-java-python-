package Assignment_05;

import java.util.Scanner;

public class HA5Q4 {
    public static void main(String[] args) {
        /*
        Write a java program to evaluate the function sin(x) as defined by the infinite series expansion.
        cos (x) = 1- 𝑥22! + 𝑥44! - 𝑥66!+ +…
The acceptable error for computation is 10-6.
         */
        CosSeries(90);
    }

    public static void CosSeries(double a) {


           double x = Math.toRadians(a);
      //  double x = a * Math.PI / 180;
        double tsv = Math.cos(x);
        int s = 1, deno = 1, i = 1;
        double osv = 1, term = 1;
        do {
            s = s *-1;
            deno = deno * (2 * i) * (2 * i - 1);
            term = term * x * x;
            osv = osv + s * term / deno;
            i++;

        } while (Math.abs(tsv - osv) >= 0.000001);
        System.out.println(osv);
    }
}

