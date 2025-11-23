package Practice_ques_01_ICP;

public class Z5P {
    public static void main(String[] args) {
        System.out.println(2+3+"bc"+'c'+'a');  // ---->5bcca
        System.out.println('c'+'a'+2+3+"bc");   //assice value of a is 97 & c = 99  So 97+99+5 =202
        System.out.println("bc"+'c'+'a'+2+3);   // bcca23 --->as 1st we give string so java by default  take other character as string java use + as concadination
        System.out.println("bc"+('c'+'a')+(2)+3);  //first char is in double semicolon so java
                                                   // take as string as we give braket for second char
                                                   // so java take as that char as integer
                                                   //and after that the + sign use as a concadination
                                                   // so simply put 2 and 3 java donot add that integer
        System.out.println('a'+'b'); //ASSI value of a id 97 and b is 98 so java simply add them 97+98=195
    }
}
