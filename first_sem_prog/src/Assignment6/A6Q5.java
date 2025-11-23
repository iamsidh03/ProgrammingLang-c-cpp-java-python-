package Assignment6;

import java.util.Scanner;

public class A6Q5 {
    public static double area(int n, double side){
        double ar = (n*Math.pow(side,2))/(4*Math.tan((Math.PI)/n));

        return ar;
    }
    public static void main(String[] args) {
        /*
        A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree
         (i.e., the polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is
Area = 𝑛 × 𝑆2/(4 ×tan(𝜋/𝑛))
Write a method that returns the area of a regular polygon using the following header:
public static double area(int n, double side)
         */
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter number of side ");
        int n = sc.nextInt();
        System.out.println(" enter side ");
        double side = sc.nextDouble();
        System.out.println(" the area of polygon is "+area((int)  n,side));
    }
}
