import java.util.Scanner;

public class Assignment_2Ques {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a degree in Fahrenheit: ");
         double f = sc.nextDouble();
         double celsius = (f -32)*5.0/9;
         System.out.println( (int)f+" Fahrenheit is "+celsius+ " Celsius ");





    }
}
