class Solution {
    public boolean isPowerOfFour(int n) {

        int  i = 0;
        boolean check = false;

        double result = 0;
        for(int j = 0 ; result < n ; j++ ){
            result = Math.pow(4,j);
            if(result == n){
                check = true;
                break;
            }
        }
        return check;

    }
}