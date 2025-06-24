class Solution {
    public int countSegments(String s) {

        s = s.trim();

        if(s.isEmpty()){
            return 0;
        }

        int count = 1;

        for(int i = 0 ; i < s.length()-1 ; i++){

            if(s.charAt(i)==' '){
                int j = i+1;
                if(s.charAt(j) != ' '){
                    count++;
                }
            }
        }

        return count;

        
    }
}