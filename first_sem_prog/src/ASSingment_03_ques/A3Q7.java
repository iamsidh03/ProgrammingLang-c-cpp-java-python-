package ASSingment_03_ques;

import java.util.Scanner;

public class A3Q7 {
    public static void main(String[] args) {
/*
From the above question no.
 (6) write a java program with a choice if the consumer wants to pay bill online.
 Consumer who pays their electricity bill online will get a discount of 3%.
Here is the sample output:
No. of units consumed: 867
Do you want to pay online(y/n): y
Total amount: 4925.4
Discount: 147.762
Amount payable: 4777.638
 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of unit consumed: ");
        float unit = sc.nextFloat();
        float billpay = 0;
        System.out.println("Do you want to pay online(y/n): ");
        char s = sc.next().charAt(0);
        char y ='y';
        char n ='n';
        if (s==y) {


             if (unit <= 50) {
                billpay = 3 * unit;
                System.out.println("bill pay: " + billpay);
            } else if (unit <= 200) {
                billpay = 50 * 3 + (unit - 50) * 4.80f;
                System.out.println("bill pay: " + billpay);
            } else if (unit <= 400) {
                billpay = 50 * 3 + 200 * 4.80f + (unit - 200) * 5.80f;
                System.out.println("bill pay: " + billpay);
            } else if (unit > 400) {
                billpay = 50 * 3 + 150* 4.80f + 200 * 5.80f + (unit - 400) * 6.20f;
                System.out.println("bill pay: " + billpay);

            }
            float dis = billpay * 0.03f;
             float T = billpay;
            System.out.println("TOTAL AMOUNT: "+T);
            System.out.println("discount is: " + dis);
            float tot = billpay - dis;
            System.out.println(" AMOUNT PAYABLE is: " + tot);
        }
        else if (s==n){
            if (unit<=50){
                billpay = 3*unit;
                System.out.println("bill pay: "+billpay);
            }
            if(unit<=200){
                billpay = 50*3+(unit-50)*4.80f;
                System.out.println("bill pay: "+billpay);
            }
            if(unit<=400){
                billpay=50*3+150*4.80f+200*5.80f+(unit-400)*6.20f;
                System.out.println("bill pay: "+billpay);
            }
            if (unit>400){
                billpay= 50*3+150*4.80f+200*5.80f+(unit-400)*6.20f;
            }

            System.out.println("AMOUNT PAYABLE: "+billpay);

        }



        }
    }

