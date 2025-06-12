import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        int j = 0;
        boolean check=false;

        for(int  i = 1 ; i < nums.length ; i ++){

            j = i - 1;
            if(nums[j]==nums[i]){
                check = true;
            } 
        }


        return check;
        
    }

}