package Linear_search;

public class Search_String_Array_LS {
    public static void main(String[] args) {
        String str="Siddharth";
        char target='t';
        int ans= StringLS(str,target);
        System.out.println(target+" found at index "+ans);
    }
    static int StringLS(String str,char target){
        for (int index = 0; index <str.length() ; index++) {
            if (str.charAt(index)==target){
                return index;
            }
        }
        return -1;
    }
}
