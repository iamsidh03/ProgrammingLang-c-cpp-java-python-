import java.util.*;
class str01 {
    public static void main(String[] args) {
        // char arr[]={'a','b'};
        // String str="abc";
        // String str2=new String("abc"); // Changed to match str
        // System.out.println(str.equals(str2)); // true
        // System.out.println(str.equals(new String("abc"))); // true

        // 'str' and 'str2' both are strings but their implementation level is different
        // Strings are immutable in Java, meaning their values cannot be changed after creation.
       // Scanner sc = new Scanner(System.in);
       // String name;
       // name=sc.next();
       // System.out.println(name);

        //concatenation
    //     String firstName="raj";
    //     String lastName="kumar";
    //     String fullName=firstName+
    //     " "+lastName;
    //     System.err.println(fullName);
    //     System.err.println(fullName.charAt(5));
    //    // printLetters(fullName);
    //    System.out.println(fullName.length());
        //  String str2="racecar";
        // boolean ispalindrome=checkPalindrome(str2);
        // System.out.println(ispalindrome);

       // System.out.println(shortest("WNEENESENNN"));

    //    String s1="Tony";
    //    String s2="Tony";
    //    //here s1 and s2 pointing to same "tony" in memory
    //    String s3=new String("Tony");
    //    // here new "Tony is created in memory" 
    //    if(s1==s2){//compare memory location also
    //     System.out.println("s1 and s2 are same");
    //    }else{
    //     System.out.println("s1 and s2 are not same");
    //    }
    //    if(s1==s3){
    //     System.out.println("s1 and s3 are same");
    //    }else{
    //     System.out.println("s1 and s3 are not same");
       
    //    }
    //    if(s1.equals(s3)){ //checks the value only
    //     System.out.println("s1 and s3 are same");
    //    }else{
    //     System.out.println("s1 and s3 are not same");
       
    //    }
    // System.out.println(substring("helloWorld", 2, 5));
    // String str="HelloWorld";
    // System.out.println(str.substring(2,5));//inbulit java function



    /*
     * lexico comparision in string
     * Inbuilt function: str1.compareTo(str2)
     *  if 0 the both strings are equal
     *  if <0 (-ve) then str1<str2
     *  if >0 (+ve) the str1>str2
     * 
     * comparetoignorecase
     *  this ignore upper or lower case
     */
    /*
    String  fruits[]={"apple","mango","banana"};
    String lar=fruits[0];
    for (int i = 0; i < fruits.length; i++) {
        if(lar.compareTo(fruits[i])<0){
            lar=fruits[i];
        }
        
    }
    System.out.println(lar);
    //TC: O(X*N) X:length of largest string and N is length of Array
    //SC: O(1)

     */



     //StringBuilder
     //append() : add at the end
     //insert() : add at the specified position
     //delete() : delete the specified position
     //reverse() : reverse the string
     //substring() : return the substring from the specified position
     //length() : return the length of the string
     //charAt() : return the character at the specified position
     //indexOf() : return the index of the specified character
     //lastIndexOf() : return the index of the last occurrence of the specified character
     //replace() : replace the specified character with the specified character
     //trim() : remove the leading and trailing spaces
     //reverse() : reverse the string
     //deleteCharAt() : delete the character at the specified position
     //StringBuilder sb =new StringBuilder("hello");
      

     /*
      * you can convert any object to string (integer, float, character ..)
      * but the condition is that It must be an object eg
      * int a=10;
      * a.toString(); //This is not allowed gives error
      * it must be an object of string
      * eg:
      * Integer a=10;
      * a.toString();
      */
      /*
      StringBuilder sb =new StringBuilder("");
      for (char i = 'a'; i<='z'; i++) {
         sb.append(i);
        }
        //TC: O(26)
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.reverse());
       */

       /*
        What are Strings
        ans:String is a sequence of characters

        computer has two types of memeory
        1)Stack memory
        2)Heap memory

        Interning: If you have same String in heap/String pool/intern pool
        then it will be stored only once in heap/String pool/intern pool
        and all other reference will be pointing to that single object in heap/String pool/intern pool

        agar String me bar bar chote chote changes karne ho,
        eg: tony then tonya, tonyb, tonyc.....
        in this case if we are using String the TC will be O(n^2)
        because every time we are creating new object in heap/String pool/intern pool
        and then we are copying the old object to new object in heap/String pool/intern pool
        so in this case it is prefered to use Stringbuilder
        





         */





    }
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
            
        }System.out.println();
    }
    public static boolean checkPalindrome(String str){
        //str.toLowerCase();
        int len=str.length();
        int i=0;
        int low=0;
        int high=len-1;
        while(i!=len/2){
            if(str.charAt(low)!=str.charAt(high)){
                return false;
            }
            low++;
            high--;
            i++;
        }
        return true;

    }
    public static float shortest(String str){
        int x=0,y=0;
       // int len=str.length();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='W' || str.charAt(i)=='w'){
                    x--;
             }
             else if(str.charAt(i)=='E' || str.charAt(i)=='e'){
                x++;
            }
            else if(str.charAt(i)=='N' || str.charAt(i)=='n'){
                y++;
            }
            else if(str.charAt(i)=='S' || str.charAt(i)=='s'){
                y--;
            }
        }
        float disp=(float)Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)));

return disp;
    
}
public static String substring(String str,int si,int ei){
    String substr="";
    for (int i = si; i < ei; i++) {
        substr+=str.charAt(i);
}
return substr;
}
 
 
}
