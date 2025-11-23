import java.util.Scanner;

public class A1Q1 {
    public static void main(String[] args) {
        //A,B,C

       /* char a = 'a';
        char b = 'B';
        char c = 'C';
        int num = (int)a;
        System.out.println(a);
        int sum = (int) (a+b+c/3);
        System.out.println(sum);

        */


        System.out.println("enter price of pencil ");
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Rs " + pencil );

        System.out.println("enter price of pen ");
        float pen = sc.nextFloat();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Rs " +pen);

        System.out.println("enter price of eraser ");
        float eraser = sc.nextFloat();
        System.out.println("Rs " + eraser);

        float total = (pencil + pen + eraser);
        System.out.println(total);
        System.out.println("total price");
        float gst =((18*total)/100);
        System.out.println("your gst is " +gst);
        System.out.println("total price including gst");
        System.out.println(total+gst);




/*
        byte b =4;
        char c ='a';
        short s= 512;
        int i= 1000;
        float f = 3.14f;
        double d = 99.9954;
        double ans = (f*b)+(i%c)-(d*s);
        System.out.println(ans);


        int $ = 23;
        System.out.println($);

 */




    }
}
