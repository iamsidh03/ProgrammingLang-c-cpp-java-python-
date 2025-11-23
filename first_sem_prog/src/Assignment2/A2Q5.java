package Assignment2;
import java.util.Scanner;
public class A2Q5 {
    public static void main(String[] args) {
      /*  Write a java program that reads the radius of a hemisphere and computes
        the surface area and volume using the following formulas:
        Surface Area of Hemisphere = 3 π r2. Volume of a hemisphere = (2/3)πr3
        Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the hemisphere.
        Hint: Use Math.PI.
                Here is a sample run: Enter the radius of the hemisphere: 7.0
        The surface area of the hemisphere is 461.814 The volume area of the hemisphere is 718.377

       */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        double SA = 3*Math.PI*Math.pow(r,2);
        double VH = 2.0/3*Math.PI*Math.pow(r,3);
        System.out.println("Surface area = "+SA);
        System.out.println("Volume of Hemisphere = "+VH);
    }
}
