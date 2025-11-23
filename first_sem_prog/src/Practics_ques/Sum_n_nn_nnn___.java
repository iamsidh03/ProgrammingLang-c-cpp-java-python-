package Practics_ques;

import java.util.Scanner;

public class Sum_n_nn_nnn___ {
    //error
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter number ");
        int n=sc.nextInt();
        int t = n;
        int multi =0;
        int sum =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n);

            }
            if(i!=n) {
                System.out.print("+");
            }

        }
        for (int i =1;i<=t;i++){
            for (int j=0;j<i;j++){
                sum += n*Math.pow(10,j);
               // System.out.println();
            }
            //System.out.println(sum);
        }
        System.out.println(" sum "+sum);





    }
}
