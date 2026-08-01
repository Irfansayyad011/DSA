class Solution {
    int start =0;
    int maxlen=0;
    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }
        return s.substring(start, start+maxlen);
    }
    private void expand(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            if(right-left+1 > maxlen){
                maxlen = right-left+1;
                start = left;
            }
            left--;
            right++;
        }
    }
}







// class Solution {
//     public String longestPalindrome(String s) {
//         int n= s.length();
//         String ans="";
//         for(int i=0; i<n;i++){
//             for(int j=i; j<n ;j++){
//                 if(isPalindrome(s,i,j)){
//                     if((j-i+1) > ans.length()){
//                         ans = s.substring(i,j+1);
//                     }
//                 }
//             }
//         }
//         return ans;
//     }

//     private boolean isPalindrome(String s, int left, int right){
//         while(left < right){
//         if(s.charAt(left) != s.charAt(right)){
//             return false;
//         }
//         left++;
//         right--;
//     }
//     return true;
// }
// }