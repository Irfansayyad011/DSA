class Solution {
    public int trap(int[] height) {
        int water=0;
        int n=height.length;
        int l=0;
        int r=n-1;
        int leftMax=height[l];
        int rightMax=height[r];

        while(l<r){
            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(height[l], leftMax);
                water +=leftMax-height[l];
            }else{
                r--;
                rightMax=Math.max(rightMax,height[r]);
                water +=rightMax-height[r];
            }
        }
        return water;
    }
}