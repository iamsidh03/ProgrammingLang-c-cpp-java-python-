package Practice_ques_01_ICP;

public class Z3P {
    public static void main(String[] args) {
        int a=2,b=5,c;

        a=a*a++ - --a; //  a*a++ ---> 4 and  now a=3 so --a = 2 ie 2*2-2-->2
        c=b++ - b--;      //5 -6 -->-1
        System.out.println("a="+a+",b="+b+",c="+c);  //a=2,b=5,c=-1
        System.out.println(a++ + ++a * a--);         //2+4*4-->18
        System.out.println(b=b++ * b--);             //5*6-->30
        System.out.println("a="+a+",b="+b+",c="+c);



    }
}
