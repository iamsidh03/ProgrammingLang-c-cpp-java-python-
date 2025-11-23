package Assignment2;
import java.util.Scanner;
public class HA2Q2 {
    public static void main(String[] args) {
      /*  If you have N eggs, then you have N/12 dozen eggs
        , with N%12 eggs left over.
    (This is essentially the definition of the / and % operators for integers.)
        Write a java program that asks the user how many eggs she has and then
        tells the user how many dozen eggs she has and how many extra eggs are left over.
                A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user how many gross,
                how many dozen, and how many left over eggs she has. For example,
        if the user says that she has 1342 eggs, and then your program would respond with Your number of eggs is 9 gross, 3 dozen, and 10.


       */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gross = n/144;
        int dozen = (n%144)/(12);
        int left = (n%144)%12;
        System.out.println(gross+"\t"+dozen+"\t"+left);
    }
}
