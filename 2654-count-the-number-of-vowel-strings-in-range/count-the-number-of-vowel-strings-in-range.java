class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String vowel = "AEIOUaeiou";
        int check = 0;
        for(int i = left; i <= right ; i++){
            String str = words[i];
            if(!(str.isEmpty())){
    
            String start = String.valueOf(str.charAt(0));
            String end = String.valueOf(str.charAt(str.length()-1));
            
            if(vowel.contains(start) && vowel.contains(end)){
                check++;
            }

            }
        }

        return check;
    }
}