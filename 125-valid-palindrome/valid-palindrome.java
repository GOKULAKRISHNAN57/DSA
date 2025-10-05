class Solution {
    public boolean isPalindrome(String s) {
        String cleanedStr = s.replaceAll("[^a-zA-Z0-9]","");
        cleanedStr = cleanedStr.toLowerCase();

        StringBuilder reverse = new StringBuilder(cleanedStr).reverse();

        String reverseStr = reverse.toString();
        return reverseStr.equals(cleanedStr);
    }
}