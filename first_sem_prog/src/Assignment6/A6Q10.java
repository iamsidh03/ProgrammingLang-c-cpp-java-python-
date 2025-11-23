package Assignment6;

import java.util.Scanner;

public class A6Q10 {

    public static double calculateArea(double base,double height){
        return 0.5*base*height;
    }
    public static double calculateArea(double side){
        return side*side;
    }
    public  static double calculateArea(float radius){
        return (double)Math.PI*radius*radius;
    }
    public static double calculateArea(float length,float breadth){
        return (double)length*breadth;
    }
    public static void main(String[] args) {
        /*
Write a java program to calculate the area of triangle, square, circle, rectangle by using method overloading
         */
        Scanner sc = new Scanner(System.in);
        System.out.println();
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double side = sc.nextDouble();
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();





        System.out.println("Area of triangle: " + calculateArea(base,height));
        System.out.println("Area of square: " + calculateArea(side));
        System.out.println("Area of circle: " + calculateArea(radius));
        System.out.println("Area of rectangle: " + calculateArea(length,breadth));
        System.out.println("");



}
}
