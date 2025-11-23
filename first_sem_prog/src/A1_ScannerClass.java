import java.util.Scanner;

public class A1_ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type word");
        String input = sc.next(); //only use to print single word
        System.out.println(input);

        //HOW TO PRINT LINE USING SCANNER CLASS
       // Scanner sc1 = new Scanner(System.in);
        //System.out.println("type line ");
       // String input1 = sc.nextLine();
      //  System.out.print(input1);

        //print integer using Scanner
        Scanner sc2 = new Scanner(System.in);
        System.out.println("type int");
        int number = sc.nextInt();
        System.out.println(number);

        // print float using Scanner
        Scanner sc3 = new Scanner(System.in);
        System.out.println("type float");
        float price = sc.nextFloat();
        System.out.println(price);

        //print byte using Scanner
        Scanner sc4 = new Scanner(System.in);
        System.out.println("type Byte");
        byte b1 = sc.nextByte();
        System.out.println(b1);


        // print boolean using Scanner
        Scanner sc5 = new Scanner(System.in);
        System.out.println("type Boolean");
         boolean B1 = sc.nextBoolean();
         System.out.println(B1);

         //print Double using Scanner
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Type Double");
        Double D1 = sc.nextDouble();
        System.out.println(D1);

        //print short using Scanner
        Scanner sc7 = new Scanner(System.in);
        System.out.println("type Short");
        Short S1 = sc.nextShort();
        System.out.println(S1);

        //print long using scanner class
        Scanner sc8 = new Scanner(System.in);
        System.out.println("type Long");
         long L1 = sc.nextLong();
        System.out.println(L1);

        ;







    }




}
