package ASSingment_03_ques;
import java.util.*;
public class A3Q6 {
    public static void main(String[] args) {
        /*
        Write a java program to calculate the monthly electricity bill.
         The tariff is given as follows:
        Price per unit
        Unit range

        Rs. 3/-
                First 50 units
        Rs. 4.80/-
                50-200 units
        Rs. 5.80/-
                200-400 units
        Rs. 6.20/-
                Above 400 units


         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of unit consumed: ");
        float unit = sc.nextFloat();
        float billpay=0;
        if (unit<=50) {
            billpay = 3 * unit;
            System.out.println("bill pay: " + billpay);
        }
        else if (unit<=200) {
                billpay = 50 * 3 + (unit - 50) * 4.80f;
                System.out.println("bill pay: " + billpay);
            }
        else if(unit<=400) {
                    billpay = 50 * 3 + 150 * 4.80f + (unit - 200) * 5.80f;
                    System.out.println("bill pay: " + billpay);
                }
        else if (unit >400) {
                        billpay = 50 * 3 + 150 * 4.80f + 200 * 5.80f + (unit - 400) * 6.20f;
                        System.out.println("bill pay: " + billpay);
                    }


    }
}
