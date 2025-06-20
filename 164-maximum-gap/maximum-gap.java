import java.util.Arrays;

class Solution {
    public int maximumGap(int[] nums) {
        
        Arrays.sort(nums);
        int max = 0;
        int value = 0; 

        for(int i =  1 ; i < nums.length ; i++){
            int j = i - 1;

            value = nums[i]-nums[j];

            if(max < value){
                max = value;
            }
        }

        return max;
    }
}