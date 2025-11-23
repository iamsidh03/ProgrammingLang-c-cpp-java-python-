package Assignment2;
import java.util.Scanner;
import java.util.Scanner;

public class HA2Q3 {
    public static void main(String[] args) {
       /* Write a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area. The formula for computing the area of a triangle is
                s = (side1 + side2 + side3)/2;
        area=√𝑠∗(𝑠−𝑎)∗(𝑠−𝑏)∗(𝑠−𝑐)
        Here is a sample run:
        Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5
                -3.4
        The area of the triangle is 33.6

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X1: ");
        double X1 = sc.nextDouble();
        System.out.println("Enter Y1: ");
        double Y1 = sc.nextDouble();
        System.out.println("Enter X2: ");
        double X2= sc.nextDouble();
        System.out.println("Enter Y2: ");
        double Y2 = sc.nextDouble();
        System.out.println("Enter X3: ");
        double X3 = sc.nextDouble();
        System.out.println("Enter Y3: ");
        double Y3 = sc.nextDouble();

        double side1 = Math.sqrt(Math.pow(X2-X1,2)+Math.pow(Y2-Y1,2));
        double side2 = Math.sqrt(Math.pow(X3-X2,2)+Math.pow(Y3-Y2,2));
        double side3 = Math.sqrt(Math.pow(X3-X1,2)+Math.pow(Y3-Y1,2));
        double side = (side1+side2+side3)/(2);
        double area = Math.sqrt(side*(side-side1)*(side-side2)*(side-side3));
        System.out.println("Your area is: "+area);
    }
}
