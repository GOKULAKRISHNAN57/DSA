class Solution {
    public int firstUniqChar(String s) {

        String newstr = "";

        for(int i = 0; i < s.length(); i++){
            newstr = s.substring(0,i) + s.substring(i+1,s.length());
            String check = String.valueOf(s.charAt(i));
            if(!(newstr.contains(check))){
                return i;
            }
        }

        return -1;
    }
}