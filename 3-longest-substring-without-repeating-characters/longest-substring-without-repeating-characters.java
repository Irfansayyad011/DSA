class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxAns=0;
        int n=s.length();
        for (int i=0; i<n; i++){
            Set<Character>set = new HashSet<>();
            for(int j=i; j<n; j++){
                char c = s.charAt(j);
                if(set.contains(c)){
                    break;
                }
                set.add(c);
                maxAns = Math.max(maxAns, j-i+1);
            }
        }
    
        return maxAns;
    }
}