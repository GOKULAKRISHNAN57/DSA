class Solution {
    public boolean isPalindrome(String s) {
        String cleanedStr = s.replaceAll("[^a-zA-Z0-9]","");
        cleanedStr = cleanedStr.toLowerCase();

        String reverse = "";

        for(int i =  cleanedStr.length()-1 ; i >= 0 ; i--){
            reverse += cleanedStr.charAt(i);
        }

        return reverse.equals(cleanedStr);
    }
}