import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int max = 0;
        int result = 0;

        for(int i = 0; i < nums.length; i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(max < map.get(nums[i])){
                max = map.get(nums[i]);
                result = nums[i];
            }
        }

        return result;
    }
}