class Solution {
    public int strStr(String haystack, String needle) {

        Boolean check = false;

        if(haystack.contains(needle)){
            check = true;
            return haystack.indexOf(needle);
        }

        else{

            return -1;
        }


        
    }
}