public class a14_MethodsInJava {

    static void change2(int []arr){
         arr[0] = 98;
    }
     static void quote(){
         System.out.println("When you have a dream,\n" + "you've got to grab it and never let go." );
     }
    static int logic (int x, int y ){
        int z;

        if (x>y){
            z=x+y;
        }
        else{
            z=x*y;
        }
        return z;

    }



    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        int c;
        // Directly use this to define logic
         c= logic(a,b); //methods in java
        /*
        if (a>b){
            c=a+b;
        }
        else{
            c=a*b;
        }

         */

        System.out.println(c);


        int a1 = 12;
        int b1 = 3;
        int c1;
        if (a1>b1){
            c1=a1+b1;
        }
        else{
            c1=a1*b1;
        }
        System.out.println(c1);

        // Want to print anything
        quote();


        //Want to change the marks of an Array

        int marks [] = {14,58,98,69,98};
        change2(marks);
        System.out.println(" the new marks after changing is " + marks[0]);

    }
}
