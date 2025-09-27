import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(!(map.containsKey(nums[i]))){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }

            if( ( map.get(nums[i]) ) > (nums.length)/3 && !(list.contains(nums[i]))){
                list.add(nums[i]);
            }

        }

        return list;
    }
}