class Solution {
    public int reverse(int x) {
        int rev =0 ;
        int min = Integer.MIN_VALUE/10;
        int max =  Integer.MAX_VALUE/10;
        while(x!=0){
            int digit=x % 10;
            if(rev > max || rev < min){
                return 0;
            }
            rev = (rev *10)+digit;
            x=x/10;
        }
        return rev;
    }
}