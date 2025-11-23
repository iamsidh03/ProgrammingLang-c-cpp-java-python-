package ASSingment_03_ques;
import java.util.Scanner;
public class A3q9 {
    public static void main(String[] args) {
        /*
        Write a program to input 3 integer number a, b, c.
        Find the largest number among 3. Also find the 2nd largest number among 3. Here is the sample output:
          Enter the value of a, b, c:10 30 50
          Largest number: 50
          2nd largest number: 30
         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b= sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();
        if((a>b&&c<b)&&(b>c&&b<a)){
            System.out.println("Largest number: "+a);
            System.out.println(" 2nd Largest number: "+b);
        }else if(a>b&&a<c){
            System.out.println(" 2nd Largest number: "+a);

        }else if (b>a&&b>c){
            System.out.println("Largest number: "+b);

        }else if (b>c&&b<a){

        }else if(c>a&&c>b){
            System.out.println("Largest number: "+c);
        } else if (c>a&&c<b) {
            System.out.println(" 2nd Largest number: "+c);
        }

         */


 Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b= sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();
        if (a>b&&b>c){
            System.out.println("Largest number: "+a);
            System.out.println(" 2nd Largest number: "+b);
        }else if(b>a&&a>c){
            System.out.println("Largest number: "+b);
            System.out.println(" 2nd Largest number: "+a);
        }else if(c>b&&b>a){
            System.out.println("Largest number: "+c);
            System.out.println(" 2nd Largest number: "+b);
        }else if(a>c&&c>b){
            System.out.println("Largest number: "+a);
            System.out.println(" 2nd Largest number: "+c);
        }else if (b>c&&c>a){
            System.out.println("Largest number: "+b);
            System.out.println(" 2nd Largest number: "+c);
        } else if (c>a&&a>b) {
            System.out.println("Largest number: "+c);
            System.out.println(" 2nd Largest number: "+a);

        }



    }
}
