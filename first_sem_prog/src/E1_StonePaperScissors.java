import java.util.Scanner;
import java.util.Random;
public class E1_StonePaperScissors {
    public static void main(String[] args) {
        int user,comp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 For Stone");
        System.out.println("Enter 1 For Paper");
        System.out.println("Enter 2 For Scissors");
        user = sc.nextInt();
        Random rn = new Random();
        comp  = rn.nextInt(3);
        if (user==0&&comp==1)
            System.out.println("OOPs computer win");
        if (user==1&&comp==2)
            System.out.println("OOps computer win");
        if (user==2&&comp==0)
            System.out.println("you win");
        if (user==1&&comp==0)
            System.out.println("you win");
        if (user==0&&comp==2)
            System.out.println("OOPs computer win");
        if (user==2&&comp==1)
            System.out.println("you win");
        if (user>2)
            System.out.println("Please do as Instructed. Do not test the developer by Lurking around.\"");
        if (user==comp)
            System.out.println("Its Tie!"+"let's Play Again");

    }
}
