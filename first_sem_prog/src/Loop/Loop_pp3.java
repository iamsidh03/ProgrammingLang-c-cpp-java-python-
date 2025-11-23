package Loop;
import java.util.Scanner;
public class Loop_pp3 {
    public static void main(String[] args) {
        /*
        Write a program to find the factorial value of any number entered through the keyboard.
         */
          //5= 5*4*3*2*1
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
         long factorial=1,factorial1=1,k=1, j=1;
        for(long i =1; i<=num;i++)
        {
           factorial*=i;
          // j=i;
            //System.out.println(num +" = " + j+" * ");
        }  System.out.println(factorial);


        System.out.println("\"using while loop\"");
        while(k<=num){
            factorial1*=k;
            k++;
        }
        System.out.println(factorial1);

    }
}
