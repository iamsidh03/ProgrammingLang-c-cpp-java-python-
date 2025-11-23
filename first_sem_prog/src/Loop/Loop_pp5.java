package Loop;
import java.util.Scanner;
public class Loop_pp5 {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//123
        int reverse=0;
       while(num!=0){      //!=0                          //12!=0          //1!=0
           int r = num%10;   //3                         // r=2             //r=0
           reverse=reverse*10+r;  // 0*10+3--->3        //1*10+2--->12       //120
           num/=10;  //12                               //1                 //0
       }
        System.out.println(reverse);


    }
}
