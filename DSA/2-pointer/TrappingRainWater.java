class TrappingRainWater {
    public static int trap(int[] height) {
        int ans=0;
        // first initialise the points i , j , maxLeft , maxRight to 0
        int i=0; // at the begining of the array
        int j=height.length-1; // at the ending of the array
        int maxRight=0; // initialise the max right
        int maxLeft=0; // initialise the max left 

        //now checking the i is not exceding j 
        while(i<j){
            if(height[i]<height[j]){
                maxLeft=Math.max(height[i], maxLeft);
                ans+=maxLeft-height[i];
                i++;
            }
            else{
                maxRight=Math.max(maxRight, height[j]);
                ans+=maxRight-height[j];
                j--;
            }
        }
        return ans;
   }
   public static void main(String[] args) {
    int[] arr= new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        trap(arr);
   }
}