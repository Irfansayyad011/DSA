class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>q=new ArrayDeque<>();
        int n=nums.length;
        int[]res = new int[n-k+1];
        int index =0;
        for(int i=0;i<n;i++){
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.addLast(i);
            if(q.peekFirst() == i-k){
                q.pollFirst();
            }
            if(i >= k-1){
                res[index] = nums[q.peekFirst()];
                index++;
            }
        }
        return res;
    }
}