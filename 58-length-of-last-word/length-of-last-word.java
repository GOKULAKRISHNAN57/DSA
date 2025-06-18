class Solution {
    public int lengthOfLastWord(String s) {

        String sentence = s.trim();
        int length = sentence.length();
        int temp=0;

        for(int i = length-1 ; i >=0 ; i-- ){
            if( sentence.charAt(i) != ' '){
                temp++;
            }

            else{
                break;
            }
        }
        
        return temp;
    }
}