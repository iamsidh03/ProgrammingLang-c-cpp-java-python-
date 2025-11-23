package Loop;
import java.util.*;
public class L1 {
    public static void main(String[] args) {
//wrong code
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
       int rev = 0;
      for (num=num;num!=0;num/=10){        //At 1st you have to ininilized num so num = num
           int remainder = num % 10;       // the num not equal to 0 bcoz if no condition will work
           rev = rev * 10 + remainder;     // suppose i put 123 the num/=10 gives quot. i.e

          System.out.print( rev);
      }
       for (int x =1;;) {
            x = 1;
           System.out.println(x);
       }



      //  int d = 'b';
      //  System.out.println(d);
        //method 2
       // System.out.println((int)'b');
    }
}
