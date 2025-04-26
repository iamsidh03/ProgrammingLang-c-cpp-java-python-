
/*Given a string of length l you have to find all the possible substring with the subset
 * Facts: String of n length --->Math.pow(2,n); substring possible
 */
public class FindSubString {
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str, " ", 0);
    }
    public static void findSubsets(String str,String ans,int idx){
       if(idx==str.length()){
        if(ans.length()==0){
            System.out.print("null");

    }else{
        System.out.print(ans+" || ");
    }
    return;
}
findSubsets(str, ans+str.charAt(idx), idx+1); //yes choice
findSubsets(str, ans, idx+1);  //no choice
}
}
