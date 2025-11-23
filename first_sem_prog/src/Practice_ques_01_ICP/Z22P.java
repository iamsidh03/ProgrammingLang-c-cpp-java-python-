package Practice_ques_01_ICP;

public class Z22P {
    public static void main(String[] args) {
        int a=10;
        int b=6;
        int c=30;
        System.out.println(a > b || a < c); //true
        System.out.println(a > b | a < c); //true
        System.out.println(a > b || a++ < c);//true
        System.out.println(a); //10
        System.out.println(a > b | a ++ < c);//
        System.out.println(a);//11
    }
}
