package Practice_ques_01_ICP;

public class Z28P {
    public static void main(String[] args) {
        byte y=5,z=-5;
        System.out.println(~y); //-(-5+1)--->4
        System.out.println(~z); //-(5+1)---->-6
        y&= ~y; //----->
        System.out.println(y);
        byte x = -1;
        System.out.println(x>>>6);
        byte a=-5,b=-6;
        System.out.println(a|b);


    }
}
