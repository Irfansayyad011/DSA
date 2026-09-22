class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int l = 0;
        int r= s.length()-1;
        while(l<r){
            int left = s.charAt(l);
            int right = s.charAt(r);
            if(!Character.isLetterOrDigit(left)){
                l++;
            }else if(!Character.isLetterOrDigit(right)){
                r--;
            }else{
                if(s.charAt(l) != s.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}