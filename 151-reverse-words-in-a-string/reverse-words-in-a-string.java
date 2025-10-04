class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = " " + s;   // changed ". " to " " only
        int marker = s.length();
        String str = "";

        for(int i = s.length()-1; i >= 0; i--){   // include i=0 also
            if(s.charAt(i) == ' '){
                if(i+1 < marker){  // ensures non-empty substring
                    str = str + s.substring(i+1, marker) + " ";
                }
                marker = i;
            }
        }

        return str.trim();
    }
}
