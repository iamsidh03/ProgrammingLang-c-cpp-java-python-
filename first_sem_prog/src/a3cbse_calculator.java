import java.util.Scanner;

public class a3cbse_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Physics marks: ");
        int Physics = sc.nextInt();
        System.out.println("Enter Your English Marks:");
        int English = sc.nextInt();
        System.out.println("Enter Your Chemistry marks: ");
        int Chemistry = sc.nextInt();
        System.out.println("Enter Your Mathematics Marks:");
        int Mathematics = sc.nextInt();
        System.out.println("Enter Your ComputerScience Marks: ");
        int ComputerScience = sc.nextInt();

        float percentage = ((Physics+Mathematics+ComputerScience+English+Chemistry)/500f)*100;
        System.out.println("Your percentage is: ");
        System.out.println(percentage);


    }
}
