package ASSingment_03_ques;
import java.util.Scanner;
public class A3Q8 {
    public static void main(String[] args) {
        /*
        Write a java program that takes the x – y coordinates
         of a point in the Cartesian plane
          and prints a message telling
           either an axis on which the point lies or the quadrant in which it is found.
       Here is the sample output:

     (-1.0, -2.5) is in quadrant III
           (0.0, 4.8) is on the y-axis
         */
        /* method 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        float x = sc.nextFloat();
        System.out.print("Enter the y coordinate: ");
        float y = sc.nextFloat();
         if (x==0&&(y==y||y==-y)) {
            System.out.println((x+","+y)+" is on the y-axis ");
        }  if (y==0&&(x==x||x==-x)) {
            System.out.println((x+","+y)+" is on the x-axis ");
        }

        else if (x==x&&y==y){
            System.out.println((x+","+y)+" is in Quadrant I ");
        } else if (x==-x&&y==y) {
            System.out.println((x+","+y)+" is in Quadrant II ");
        } else if (x==-x&&y==-y) {
            System.out.println((x+","+y)+" is in Quadrant III");
        } else if (x==x&&y==-y) {
            System.out.println((x+","+y)+" is in Quadrant IV");
        }
        //something wrong with this

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate: ");
        float x = sc.nextFloat();
        System.out.print("Enter the y coordinate: ");
        float y = sc.nextFloat();


          if (x>0&&y>0){
            System.out.println((x+","+y)+" is in Quadrant I ");
        } else if (x<0&&y>0) {
            System.out.println((x+","+y)+" is in Quadrant II ");
        } else if (x<0&&y<0) {
            System.out.println((x+","+y)+" is in Quadrant III");
        } else if (x>0&&y<0) {
            System.out.println((x+","+y)+" is in Quadrant IV");
        }else if (x==0&&y>0) {
            System.out.println((x+","+y)+" is on the positive  y-axis ");
        }  else if (x==0&&y<0) {
            System.out.println((x+","+y)+" is on the negative  y-axis ");
        } else if (x>0&&y==0) {
            System.out.println((x + "," + y) + " is on the positive  x-axis ");
        }
          else if (x<0&&y==0){
            System.out.println((x+","+y)+" is on the negative  x-axis ");
        } else {
              System.out.println("("+x+","+y+")"+" is lie on origin ");
          }



    }
}
