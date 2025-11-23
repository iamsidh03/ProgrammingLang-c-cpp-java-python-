package Assignment2;

public class A2Q7 {
    public static void main(String[] args) {
       /* Write a java program that displays the following table. Cast floating-point numbers into integers.
                a b pow(a, b)
        1 2 1
        2 3 8
        3 4 81
        4 5 1024
        5 6 15625


        */



        //System.out.println("a\t\tb\t\t pow(a,b)");
        // int x = 1;
        //System.out.println(a  +  "\t\t"+ ++a +"\t\t"+Math.pow(a--,++a));





        int a =1;
        int b=2;
        System.out.println("number\tpower\tsquare");

        System.out.println(a+"\t\t"+b+"\t\t"+(int)Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t\t"+ b +"\t\t"+(int)Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t\t"+ b +"\t\t"+(int)Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t\t"+ b +"\t\t"+(int)Math.pow(a,b));
        a++;
        b++;
        System.out.println(a +"\t\t"+ b +"\t\t"+(int)Math.pow(a,b));

    }
}
