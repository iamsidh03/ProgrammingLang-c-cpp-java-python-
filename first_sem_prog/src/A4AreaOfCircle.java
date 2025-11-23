import java.util.Scanner;

public class A4AreaOfCircle {

    public static void main(String[] args) {

//      Scanner sc = new Scanner(System.in);
//        System.out.print("Radius of the circle:- ");
//        float a, b, product;
//        a = sc.nextFloat();
//        b = (float) 3.14;
//        product = a*a*b;
//
//        System.out.println(product);

        //METHOD 2
/*      float rad = sc.nextFloat();
        float  Area = 3.14f*rad*rad;
        System.out.println(Area);
*/
        Scanner sc = new Scanner (System.in);
        int x,y,z;
        System.out.print("Enter the value of x and y:- ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(x + " " + y);
        z = x;
        x = y;
        y = z;
        System.out.println(x + " " + y);
    }
}
