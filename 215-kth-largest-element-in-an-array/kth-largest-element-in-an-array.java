import java.util.Arrays;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = 1 ;
        int result=0;
        
        for(int i = nums.length-1 ; i >= 0 ; i--){
            if(n==k){
                result = nums[i];
            }
            n++;
        }

        return result;
    }
}