package Practice_ques_01_ICP;

public class Z25P {
    public static void main(String[] args) {
        long l = 55;
        int i = 44;
        short s = 33;
        byte b = 22;
        i = (int) l;
        s = (short) i;
        b = (byte) s;
        System.out.println("l = " + l); //55
        System.out.println("i = " + i); //55
        System.out.println("s = " + s);//55
        System.out.println("b = " + b);//55
    }
}
