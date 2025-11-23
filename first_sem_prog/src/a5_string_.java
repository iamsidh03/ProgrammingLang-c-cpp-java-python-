import static javax.swing.text.html.HTML.Tag.I;

public class a5_string_ {
    public static void main(String[] args) {
        /*char[] name = {'r','a','j'};
        String wlcm = new String(name);
        System.out.println("Welcome " + wlcm);



        //Concatenate Strings:
        String  fname , lname;
        fname = "DADA";
        lname = "JI";
        System.out.println(fname + " " + lname);

        //concatenate string with an integer

        String name;
        int quantity;
        quantity = 12;
        name = " mangoes";
        System.out.println(quantity+name);


        System.out.println("He said,\"earth is flat\".");
        System.out.println("she said,\'I love you\'.");
        System.out.println("never do things like:\\robary\\telling lie\\misbehabiour");


        System.out.println("I am Siddharth.\n I am a student. ");
        System.out.println();
        System.out.println("Age:\t19");
        System.out.println("hobbyy\b: reading");

         */


        String quote = "    TO be or Not to be     ";
        System.out.println(quote.length());
        System.out.println(quote.indexOf("be"));  //interx of text
        System.out.println(quote.indexOf("N"));   //index od char
        System.out.println(quote.toLowerCase());
        System.out.println(quote.toUpperCase());
        System.out.println(quote.trim());
        System.out.println(quote.substring(9,12));//char begin with index 9 and ends with index 12
        System.out.println(quote.replace("TO","the"));
      //System.out.println(name.startsWith()


    }
}
