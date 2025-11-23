public class test_1 {
    // check prime
    public static void Check_prime(int n)
    {
        int flag =0;
        for (int i =2;i<=(int)Math.sqrt(n);i++)
        {
            if (n%i==0){
                flag=1;
                break;
            }
        }
        if (flag!=1){
            System.out.println(" prime number ");
        }
        else {
            System.out.println(" not a prime number ");
        }

    }
    // twisted prime
    public static boolean Twisted_Prime(int n){
       int rem , rev=0,flag=0,flagR=0,Nnum=n;
        while (n!=0){
            rem=n%10;
            rev= 10*rev+rem;
            n=n/10;
        }
        for (int i =2; i<(int)Math.sqrt(Nnum);i++){
            if (Nnum%i==0){
                flag =1;
                break;
            }
        }
        for (int i =2;i<(int)Math.sqrt(rev);i++){
            if (rev%i==0){
                flagR=1;
                break;
            }
        }
        if (flag>0 && flagR>0){
            System.out.println("  not twisted prime");
        }
        else {
            System.out.println(" twisted prime ");
        }
        return false;
    }
    //print number between a to b
    //error
    public static void prime(int a, int b) {
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.println(" prime number between " + a + " " + b + " are: ");
        a++;
        int count = 0;
        for (int i = a; i < b; i++) {


            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count== 2) {
                    System.out.println(i + " ");
                }

            }
        }


    }
    public static void Amicable_number(int a,int b ){
        int fa=0,fb=0;
        for (int i = 1;i<=a/2;i++){
            if(a%i==0)
            fa+=i;
        }
        for (int i = 1;i<b/2;i++){
            if (b%i==0)
                fb+=i;
        }
        if ((fa==a)&&(fb==b))
            System.out.println(" Amicable number");
        else
            System.out.println(" not Amicable Number ");
    }
    public static void Series(double n){
        int j =1,sum=0;
        for (int i =1;i<=n;i++){
            j*=i;
        }
        for (int i =1;i<=n;i++){
            sum+=(i/j);
        }
        System.out.println(sum);
    }
    //Sin series
    public static void SinSeries(double a){
        double x =a*Math.PI/180;
        double tsv = Math.sin(x);
        int s=1,deno =1,i=1;

        double osv = x,term =x;
        s=-1*s;
        do{
            deno =deno*(2*i)*(2*i+1);
            term = term*x*x;
            osv=osv+s*term/deno;
            i++;

        } while((tsv-osv>=0.000001));
        System.out.println(osv);
        }





    public static void main(String []args){
        Check_prime(5);
        Twisted_Prime(858);
       // prime(5,15);
        Amicable_number(5,6);
        SinSeries(0.5);

    }
}
