package Loop;
import java.util.Scanner;

public class reverse_of_a_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter Number ");
        int n = sc.nextInt();
        int nnum=n;
        int rem,rev=0;
        while (n>0){
            rem=n%10;
            rev=10*rev+rem;
            n/=10;

        }
        System.out.println("the reverse number of "+nnum+" is "+ rev);
    }
}
