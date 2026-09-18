class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int want = target - nums[i];
            if (map.containsKey(want)) {
                return new int[] { i, map.get(want) };
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}