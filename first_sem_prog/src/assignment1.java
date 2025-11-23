import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        /*ques 1
        double fahrenheit = 54;
        double celsius = (fahrenheit -32)*5.0/9;
        System.out.println(celsius);





       QUES 2


        float meter = 1000*km;
        System.out.println(km+" km is "+meter+ " meters ");
        float feet = 3280.8399f*km;
        System.out.println(km+" km is "+feet+" feet ");
        float inch = 39370.0787f*km;
        System.out.println(km+" km is "+inch+" inch ");
        float centimetre = 100000f*km;
        System.out.println(km+" km is "+centimetre+" centimetres ");

         */

         /*
         QUES 3




          */

        /*
        QUES 4
        When a brick is dropped from a tower,
         it falls faster and faster until it hits the earth.
         The distance it travels is given by d = (1/2) gt2 Here d is in feet,
          t is the time in seconds, and g is 32.174.
           Write a program that asks the use
           r for the number of seconds and then prints out the distance travelled.
         Here is the sample run:
            Enter the number of seconds: 5.4
            Distance travelled: 469.096


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");

        double t = sc.nextDouble();
        double dist = 1.0/2*32.174*Math.pow(t,2);
        System.out.println(" Distance Travelled: "+dist);

         */
        /*
        QUES 4


        Write a java program that displays the following table. Cast floating-point numbers into integers.
                a b pow(a, b)
        1 2 1
        2 3 8
        3 4 81
        4 5 1024
        5 6 15625



        //System.out.println("a\t\tb\t\t pow(a,b)");
       // int a = 1;
        //System.out.println(a  +  "\t\t"+ ++a +"\t\t"+Math.pow(a--,++a));


        //CODE 4
         METHOD 2 BUT HAS LIMITATION

         */
        /*
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

         */





            /*
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("number\tpower\tvalue ");
            System.out.println(num+);

         */
        /*
        Write a java program that prompts the user to enter the minutes
         (e.g., 1 billion), and displays the number of years and days for the minutes.
         For simplicity, assume a year has 365 days.
                Here is a sample run:
        Enter the number of minutes: 1000000000
        1000000000 minutes is approximately 1902 years and 214 days.

        //Solution
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
     long year =min/(60*24*365);
     long days = (min%(60*24*365))/(60*24);
        System.out.println(year+"\t"+days);

         /*
      If you have N eggs,
      then you have N/12 dozen eggs,
      with N%12 eggs left over.
      (This is essentially the definition of the / and % operators for integers.)
       Write a java program that asks the user how many eggs
      she has and then tells the user
      //how many dozen eggs she has and how many
    // extra eggs are left over. A gross of eggs is equal to 144 eggs.
    // Extend your program so that it will tell the user how many gross,
    /// how many dozen, and how many left over eggs she has.
    // For example, if the user says that she has 1342 eggs,
     and then your program would respond with Your number of eggs is 9 gross, 3 dozen, and 10

         */
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gross = n/144;
        int dozen = (n%144)/(12);
        int left = (n%144)%12;
        System.out.println(gross+"\t"+dozen+"\t"+left);

         */


        /*
        Write a java program that prompts the user to enter
         three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
          The formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area=√𝑠∗(𝑠−𝑎)∗(𝑠−𝑏)∗(𝑠−𝑐)
Here is a sample run:
Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5
-3.4
The area of the triangle is 33.6
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X1: ");
        double X1 = sc.nextDouble();
        System.out.println("Enter Y1: ");
        double Y1 = sc.nextDouble();
        System.out.println("Enter X2: ");
        double X2= sc.nextDouble();
        System.out.println("Enter Y2: ");
        double Y2 = sc.nextDouble();
        System.out.println("Enter X3: ");
        double X3 = sc.nextDouble();
        System.out.println("Enter Y3: ");
        double Y3 = sc.nextDouble();

        double side1 = Math.sqrt(Math.pow(X2-X1,2)+Math.pow(Y2-Y1,2));
        double side2 = Math.sqrt(Math.pow(X3-X2,2)+Math.pow(Y3-Y2,2));
        double side3 = Math.sqrt(Math.pow(X3-X1,2)+Math.pow(Y3-Y1,2));
        double side = (side1+side2+side3)/(2);
        double area = Math.sqrt(side*(side-side1)*(side-side2)*(side-side3));
        System.out.println("Your area is: "+area);




















    }




}
