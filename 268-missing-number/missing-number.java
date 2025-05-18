class Solution {
    public int missingNumber(int[] nums) {

        int sum = 0 ;

        int realsum = 0 ;

        for( int i = 0 ; i < nums.length ; i ++ ){

            sum = sum + nums[i];

            int j = i+1;
            realsum = realsum + j;
            
            
        }

        return realsum - sum;
        
    }
}