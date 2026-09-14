class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long currSum=0, maxSum=0;
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(i >= k-1){
                if(map.size()==k)maxSum = Math.max(currSum,maxSum);
                currSum -= nums[i-k+1];
                map.put(nums[i-k+1], map.get(nums[i-k+1])-1);
                if(map.get(nums[i-k+1]) == 0)map.remove(nums[i-k+1]);
            }
        }
         
        return maxSum;
    }
}