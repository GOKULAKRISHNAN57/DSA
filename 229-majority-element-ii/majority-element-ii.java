import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        ArrayList<Integer> newarray = new ArrayList<>();
        
        if(nums.length == 0 || nums.length == 1 || (nums.length == 2 && nums[0] != nums[1]) ){
            for(int num : nums){
                newarray.add(num);
            }
            return newarray;
        }

        int determine = nums.length/3;

        int max = 1;
        Arrays.sort(nums);

        for(int j = 1 ; j < nums.length ; j++){
            int i = j-1;
            
            if(nums[i] == nums[j]){
                max++;

                if(j+1 == nums.length || nums[j] != nums[j+1]){
                    if(max > determine){
                        newarray.add(nums[j]);
                    }
                    max = 1;
                }

            }

        }
        return newarray;
    }
}