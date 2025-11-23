import java.util.Scanner;

public class a8_ArraysInJava {
    public static void main(String[] args) {
        int marks[]= new int[10]; //Array size is 100 we can change the lenths of array as per our convenient
       // Here we entre the marks using array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); //phy
        marks [1]= sc.nextInt(); //maths
        marks [2]= sc.nextInt(); //chem
        System.out.println("phy : " + marks[0]);
        System.out.println("maths : " + marks[1]);
        System.out.println("chem : " + marks[2]);

        // find %age of given marks
        int percentage = (marks[0]+ marks[1]+ marks[2])/3;
        System.out.println("percentage = " +percentage + "%");

        // how to find length of array
        System.out.println("Length of array = "+ marks.length);


    }
}
