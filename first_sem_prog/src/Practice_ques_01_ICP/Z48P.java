package Practice_ques_01_ICP;

public class Z48P {
    public static void main(String[] args) {
        int x = 5 ;
        x = x << 3 + 2 ; //5<<3+2--------->5<<5(precedence)---->5*2pow5--->160
        System.out.println( " x = " + x );//160
    }
}
