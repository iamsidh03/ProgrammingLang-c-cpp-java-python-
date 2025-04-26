
import java.util.ArrayList;
public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> Height=new ArrayList<>();
       Height.add(1);
       Height.add(8);
       Height.add(6);
       Height.add(2);
       Height.add(5);
       Height.add(4);
       Height.add(8);
       Height.add(3);
      // Height.add(7);
           // System.out.println(BruteForce(Height));
           System.out.println(Optimal(Height));
        
    }
    public static int BruteForce(ArrayList<Integer> height){
        int maxArea=0;
        for(int i=0;i<height.size();i++){
            for (int j = i+1; j < height.size(); j++) {
                int area=Math.min(height.get(i),height.get(j))*(j-i);
                if(maxArea<area){
                maxArea=area;
            }
                
            }
        }
        return maxArea;
    }
    public static int Optimal(ArrayList<Integer> height){
        int maxArea=0;
        int left=0;
        int right=height.size()-1;
        while(left<right){
            int area=Math.min(height.get(left),height.get(right))*(right-left);
            maxArea=Math.max(area,maxArea);
            if(height.get(left)<height.get(right)){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
