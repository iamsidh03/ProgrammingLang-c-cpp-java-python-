package ASSingment_03_ques;
import java.util.Scanner;
public class A3Q10 {
    public static void main(String[] args) {
        /*
        A University conducts a 100-mark exam for its student and grades them as follows.
         Assigns a grade based on the value of the marks.
          Write a java program to print the grade according to the mark secured by the student. [Use switch-case].
Mark Range
Letter Grade
>=90
O
>=80 AND <90
A
>=70 AND <80
B
>=60 AND <70
C
>=50 AND <60
D
>=50 AND <40
E
<40
F
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks ");
        float m = sc.nextFloat();
        if (m >= 90) {
            System.out.println("O");
        } else if (m >= 80 && m < 90) {
            System.out.println("A");

        } else if (m >= 70 && m < 80) {
            System.out.println("B");
        } else if (m >= 60 && m < 70) {
            System.out.println("C");
        }
        else if (m >= 50 && m < 60) {
            System.out.println("D");
        }
        else if (m >= 40 && m < 50) {
                System.out.println("E");
            }
        else {
                System.out.println("F");
            }


        }
    }



