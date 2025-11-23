package Assignment1;

public class A10 {
    public static void main(String[] args) {
        /*
        Assume a string variable ruler1 contains “1” initially
         i.e. String ruler1=”1” Write a java program to print the following output using string concatenation.
          (You can take extra string variables)
1
1 2 1
1 2 1 3 1 2 1
1 2 1 3 1 2 1 4 1 2 1 3 1 2 1
         */
        String ruler1 ="1",R2;
        System.out.println(ruler1);
        R2 ="2";
        ruler1=ruler1+R2+ruler1;
        System.out.println(ruler1);
        R2="3";
        ruler1=ruler1+R2+ruler1;
        System.out.println(ruler1);
        R2="4";
        ruler1=ruler1+R2+ruler1;
        System.out.println(ruler1);
    }
}
