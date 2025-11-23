package Assignment6;

import java.util.Scanner;

public class _1Methods {
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter numbwe 1 ");
        int num1 = sc.nextInt();
        System.out.println(" Enter number 2 ");
        int num2 = sc.nextInt();
        int sum = num2 + num1;
        System.out.println(" the sum= "+ sum);
    }
    public static void main(String[] args) {
        sum();


    }
}
