/*
 * Find any pair in sorted and rotated arraList has target sum
 * 
 */
import java.util.ArrayList;
public class Pair2Sum {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        int tar=16;
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println(sum(arr, tar));


    }
    public static boolean sum(ArrayList<Integer> arr,int target){
        int breakingPoint=-1;
        
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)>arr.get(i+1)){
                breakingPoint=i;
                break;
            }
            
        }
       int leftPointer=breakingPoint+1;
       int rightPointer=breakingPoint;


        while(leftPointer!=rightPointer){
            if(arr.get(leftPointer)+arr.get(rightPointer)==target){
                return true;
            }
            if(arr.get(leftPointer)+arr.get(rightPointer)<target){
                leftPointer=(leftPointer+1)%arr.size();
            }
            else{
              rightPointer=(rightPointer+arr.size()-1)%arr.size();
            }
        }
        return false;
    }

}
