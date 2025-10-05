class Solution {
    public int firstUniqChar(String s) {

        int array[] = new int[26];

        String newstr = "";

        for(int i = 0; i < s.length(); i++){
            array[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s.length(); i++){
            int check = s.charAt(i) - 'a';
            if(array[check] == 1){
                return i;
            }
        }

        return -1;
    }
}