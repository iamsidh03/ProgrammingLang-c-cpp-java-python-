package Practice_ques_01_ICP;

public class Z2P {
    public static void main(String[] args) {
        //ques2
        int a, b, c;
        a=-3+2*7-4;
        b=a*8+4%5-6;
        c=a+b*3-2%5-4;
        System.out.println(a+" "+b+" "+c);
        //concept use is precedence and Associativity
        //Precedence of unary is more than multiplication
        // 1st multiplication is evaluated in a and associativity from left to right
        //so a=7
        //b=54
        //c
        //54*3=162
        //2%5=2
        //162-2-4+7=163
        int f =4%5;
        System.out.println(f);

    }
}
