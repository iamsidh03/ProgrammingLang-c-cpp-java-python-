package Practice_ques_01_ICP;

public class Z43P {
    public static void main(String[] args) {
        int x = 7;
        int y = 4;
        x+=4/3+x--+y+++x+++y--;

        //x=x+4/3+x-- + y++ + x++ +y--
        //7+1+7+4+6+5--------->30
        System.out.print("x ="+x); //30
        System.out.print("y ="+y); //y+++y--......>4
    }
}
