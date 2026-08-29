class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int hi=0;
        for(int pile: piles){
            hi=Math.max(hi,pile);
        }
        int ans=hi;
        while(l <= hi){
            int mid = l+(hi-l)/2;
            if(canEat(piles,h,mid)){
                ans=mid;
                hi=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    private boolean canEat(int[]piles, int h, int k){
        long hrs=0;
        for(int pile: piles){
            hrs +=(pile+k-1)/k;
        }
        return hrs <=h;
    }
}