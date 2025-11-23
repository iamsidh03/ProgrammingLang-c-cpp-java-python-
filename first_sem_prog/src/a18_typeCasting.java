public class a18_typeCasting {
    public static void main(String[] args) {
        char ch = 'A';
        char ch1 = 'B';
        float number = ch;
        long number1 = ch1;
        // short num3 = ch1;
        //byte num4 = ch;
        //byte->short->int->float->long->double
        System.out.println(number);

        System.out.println(number1);

       //type casting
        byte b =5;
         b = (byte) (b*2);
        System.out.println(b);

        //
        int a = 1;
        float f = 20.35f;
        long g = 3;
        double d = 2;
        double ans = a + f + g + d;
        System.out.println(ans);

    }
}
