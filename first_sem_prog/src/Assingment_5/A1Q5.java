package Assingment_5;

public class A1Q5 {
    public static void main(String[] args) {
        for (int a = 2; a <= 15; a++) {
            System.out.println("Multiplication table of: " + a);
            for (int i = 1; i <= 10; i++) {
                System.out.println(a + " * " + i + " = " + a * i);
                System.out.println();
            }

        }
    }
}
