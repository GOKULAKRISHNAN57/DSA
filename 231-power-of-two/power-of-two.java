class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n == Integer.MAX_VALUE || n==0) {
            return false; 
        }

        int result = 0;
        for(int j = 0 ; result < n ; j++){

            result = (int)Math.pow(2,j);

        }

        if(result == n){
            return true;
        }

        return false;
    }
}