package Linear_search;

public class LS_Start_end {
    public static void main(String[] args) {
        //FOR STRING
        String name ="Siddharth";
        char tar='S';
        System.out.println(LS_String(name,tar,0,4));
     //FOR INTEGER VALUE
        int []num = {12,6546,487,797,213,546,77,7,5};
        int targ=5;
        System.out.println(LS_int(num,targ,1,5));
    }
    static boolean LS_String(String str,char target,int Start,int end){
        for (int i=Start;i<end;i++){
            if (str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    static int LS_int(int num[] ,int target,int start ,int end){
        for (int i = start; i < end; i++) {
            if (num[i]==target){
                return i;
            }

        }
        return -1;
    }
}
