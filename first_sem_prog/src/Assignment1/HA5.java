package Assignment1;
import java.util.Scanner;
public class HA5 {
    public static void main(String[] args) {
        /*
        Write a java program to exchange the value of 4 variables W,G,K,A
         such that the value of W will move to A, A to K, K to G and finally G to W.
          Exchange using with and without using extra variables
         */
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int g = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        System.out.println("Before swapping w= "+w+ " g="+g+" k= "+k+" a = "+a);

        w= g+k+a +w;
        a =w-(g+k+a);
        k=w-(g+k+a);
        g=w-(g+k+a);
        w =w-(g+k+a);
        System.out.println("after swapping w= "+w+ " g="+g+" k= "+k+" a = "+a);
    }
}
