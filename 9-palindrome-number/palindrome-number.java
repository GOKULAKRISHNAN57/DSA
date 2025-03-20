class Solution {

    public boolean isPalindrome(int x) {

        int y;
        String str = Integer.toString(x);
        int len = str.length();
        Boolean check=false;

        for(int i = 0 ; i < len ; i++){
            char a = str.charAt(i);
            char b = str.charAt(len-1);

            if(a==b){
                check=true;
                len -- ;
            }
            else{
                check=false;
                break;
            }
        }
        return check;

    
        
    }
}