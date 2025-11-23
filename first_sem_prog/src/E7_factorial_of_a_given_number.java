import org.w3c.dom.ls.LSOutput;

//E7_ factorial of given number using function concept
public class E7_factorial_of_a_given_number {
    public static int factorial(int n) {
        //int a = 4;
        int product = 1;
        for (int b = 1; b <= n; b++) {
            product = product * b;
        }//System.out.println("factorial"+product);
        return product;
    }


    public static int bin(int n, int r) {
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nmr = factorial(n - r);

        int bin = fac_n / fac_r * fac_nmr;
       return bin;

    }



    public static void main(String[] args) {
        System.out.println(bin(2,5));


        }

}
