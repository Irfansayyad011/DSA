class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>set = new HashSet<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                return c;
            }else{
                set.add(c);
            }
        }
        // for(int i=0; i<s.length(); i++){
        //     if(set.contains(s.charAt(i))){
        //         return s.charAt(i);
        //     }else{
        //         set.add(s.charAt(i));
        //     }
        // }    
        return ' ';
        }
}