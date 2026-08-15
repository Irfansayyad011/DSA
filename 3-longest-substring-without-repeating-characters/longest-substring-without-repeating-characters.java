class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen =0;
        int l=0;
        Map<Character, Integer>map = new HashMap<>();
        for(int r=0; r<s.length(); r++){
            char ch=s.charAt(r);

            if(map.containsKey(ch)){
                l = Math.max(l, map.get(ch)+1);
            }
            map.put(ch,r);
            maxlen= Math.max(maxlen, r-l+1);
        }
        return maxlen;
    }
}
    //     int maxAns=0;
    //     int n=s.length();
    //     for (int i=0; i<n; i++){
    //         Set<Character>set = new HashSet<>();
    //         for(int j=i; j<n; j++){
    //             char c = s.charAt(j);
    //             if(set.contains(c)){
    //                 break;
    //             }
    //             set.add(c);
    //             maxAns = Math.max(maxAns, j-i+1);
    //         }
    //     }
    
    //     return maxAns;
    // }
