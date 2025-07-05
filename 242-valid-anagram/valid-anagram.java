import java.util.Arrays; 

class Solution {
    public boolean isAnagram(String s, String t) {

        boolean check = true;
        if(s.length() != t.length()){
            return false;
        }

        char[] Array1 = s.toCharArray();
        Arrays.sort(Array1);

        char[] Array2 = t.toCharArray();
        Arrays.sort(Array2);

        String newstr1 = new String(Array1);
        String newstr2 = new String(Array2);

        for(int i = 0 ; i < newstr1.length() ; i++){
            if(newstr1.charAt(i) != newstr2.charAt(i)){
                return false;
            }
        }


        return check;
    }
}