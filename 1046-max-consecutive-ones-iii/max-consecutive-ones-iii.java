class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,zc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zc++;
            }
            if(zc > k){
                if(nums[l] == 0){
                    zc--;
                }
                l++;
            }
        }
        return nums.length-l;
    }
}