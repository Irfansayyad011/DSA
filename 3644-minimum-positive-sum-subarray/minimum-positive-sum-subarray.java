class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int MinSum = Integer.MAX_VALUE;

        for (int left = 0; left < n; left++) {

            int sum = 0;

            for (int rg = left; rg < n; rg++) {

                sum += nums.get(rg);

                int len = rg - left + 1;

                if (len >= l && len <= r && sum > 0) {
                    MinSum = Math.min(MinSum, sum);
                }

                if (len > r) {
                    break;
                }
            }
        }

        return MinSum == Integer.MAX_VALUE ? -1 : MinSum;
    }
}