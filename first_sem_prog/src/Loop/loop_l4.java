package Loop;

public class loop_l4 {
    public static void main(String[] args) {
        /*
        Write a program to print numbers from 1 to 10.
        Write a program to calculate the sum of first 10 natural number
         */
        int sum=0;
        for(int i=1;i<=10;i++) {
            sum=+i;
            System.out.print(" " + i + " ");
        }
        System.out.println("sum: "+sum);

        System.out.println();


        int j=0;
        while (j<=9){
            j++;
            System.out.print(" "+j+" ");


        }
        System.out.println();

        int k=1;
        do{
            System.out.print(" "+k+" ");
            k++;
        }while (k<=10);

        }
    }

