package Practice_ques_01_ICP;

public class Z23P {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int x=(a++ < b)?a:b;//5 : 5 //5
        int y=a+b-x; //5+5+-5
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
