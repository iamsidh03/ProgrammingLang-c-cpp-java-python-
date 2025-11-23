public class E4_Multiplication_tableOfGivenNumber {

    static void multiplication(int n ){
        for (int i = 0 ; i <=5;i++){
            System.out.format("%d X %d = %d \n" ,n,i,n*i);
        }

    }
    public static void main(String[] args) {
        /*
        write a program for finding table of a given number

         */

        int n=5; //write  the number whose table you want to print
        for (int i=1;i<=10;i++){
            System.out.printf("%d X %d\n",n,i,n*i);
        }
        System.out.println(" ");
        System.out.println(" ");



        //if you want to print table in reverse order

        int m=5; //write  the number whose table you want to print
        for (int i=10;i>=1;i--){
            System.out.printf("%d X %d\n",m,i,m*i);
        }
        System.out.println(" ");
        multiplication(8);
    }

    }


