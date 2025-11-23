package Practice_ques_01_ICP;

public class P1 {
    public static void main(String[] args) {
       // float a=  0.
       // boolean af = (a==0.5f);

        System.out.println((float)(25/6));
        System.out.println(5+7+'9');
        System.out.println('9'+5+7);
        System.out.println('9'+2+"9");
       double d1=453.369;
       double d2 = 45_3.3_69;
       double d3 = 4_5_3.3_6_9;
        System.out.println(d1);
        System.out.println(d1);
        System.out.println(d1);

        //float pi1 = 3_.1415F;      // Invalid; cannot put underscores adjacent to a decimal point
        //float pi2 = 3._1415F;      // Invalid; cannot put underscores adjacent to a decimal point
       // long socialSecurityNumber1
               // = 999_99_9999_L;         // Invalid; cannot put underscores prior to an L suffix

        //int x1 = _52;              // This is an identifier, not a numeric literal
        int x2 = 5_2;              // OK (decimal literal)
       // int x3 = 52_;              // Invalid; cannot put underscores at the end of a literal
        int x4 = 5_______2;        // OK (decimal literal)

       // int x5 = 0_x52;            // Invalid; cannot put underscores in the 0x radix prefix
       // int x6 = 0x_52;            // Invalid; cannot put underscores at the beginning of a number
       // int x7 = 0x5_2;            // OK (hexadecimal literal)
       // int x8 = 0x52_;            // Invalid; cannot put underscores at the end of a number

       // int x9 = 0_52;             // OK (octal literal)
       // int x10 = 05_2;            // OK (octal literal)
        //int x11 = 052_;            // Invalid; cannot put underscores at the end of a number

        System.out.println(x2);
        System.out.println(x4);

        String S1 = "ITER";
        String S2=  "ITER";
        System.out.println("S1==S2 IS" + S1==S2);

        String string1 = "MYTEXT";
        String string6 = "MYTEXT";

        System.out.println("Output: " + (string1 == string6));


    }
}
