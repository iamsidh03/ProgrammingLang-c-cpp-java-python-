//package array_;

/**
 * TrappingRainwater
 */
 class TrappingRainwater {

    public static void main(String[] args) {
        int []height={1,0,2,1,0,1,3,2,1,2,1};
       System.out.println(trap(height));
        
    }

        public static int trap(int[] height) {
            int n =height.length;
            int []left=new int[n];
            int []right=new int[n];
            int maxleft=0;
            int maxright=0;
            int ans=0;
            for(int i=0;i<n;i++){
                if(height[i]>maxleft){
                    maxleft=height[i];
                }
                left[i]=maxleft;
            }
            for(int j=n-1;j>=0;j--){
                if(height[j]>maxright){
                    maxright=height[j];
                }
                right[j]=maxright;
            }
            for(int i=0;i<n;i++){
                ans+=Math.min(left[i],right[i])-height[i];
            }
            return ans;
        }
    }
