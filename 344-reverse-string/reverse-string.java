class Solution {
    public void reverseString(char[] s) {
        int l = s.length - 1 ;

        for(int i = 0 ; i < s.length ; i ++){
            
            char temp = s[i];
            s[i] = s[l];
            s[l] = temp;

            l--;

            if(l == i || l < i){
                return;
            }
    
        }
    }
}