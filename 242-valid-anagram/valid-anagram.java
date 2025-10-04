import java.util.Arrays;

class Solution {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String s1 = new String(c1);
        String t1 = new String(c2);

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != t1.charAt(i)){
                return false;
            }
        }

        return true;        
    }
}