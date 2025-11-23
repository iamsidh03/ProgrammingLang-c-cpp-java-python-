package Loop;
import java.util.Scanner;
public class Loop_pp11 {
    public static void main(String[] args) {
        //let say n = 123433337
        //Wap to find how many time a number repeat
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number: ");
        int n = sc.nextInt();
        System.out.println("enter a number you want to know: ");
        int rep=sc.nextInt();
        int count =0;
        //int rem =0;
        while (n > 0) {
         int   rem=n%10;
            if(rem==rep) {
                count++;

            }n/=10;
        }
        System.out.println(rep+" is repeated "+count +" times ");
    }
}
