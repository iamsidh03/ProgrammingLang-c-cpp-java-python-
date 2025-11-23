package Practice_ques_01_ICP;

public class Z15P {
    public static void main(String[] args) {
        int x=5;
        int y=x++ + ++x + ++x; //5+7+8--->20
        int z=--y + x++ + y++; //19+9+19--->47
        int p=z++ - (z%10) + (p=z); //47-4+47
        System.out.println(x+" "+y+" "+z+" "+p);
    }
}
