class Solution {
    public int removeDuplicates(int[] nums) {

        int marker = 0;
        int count  = 0 ;
        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] != nums[marker]){
                count = 0;
                marker = marker +1 ; 
                nums[marker] = nums [i];
            }

            if(count == 0){
                if(nums[i] == nums[marker]){
                    count = 1;
                }
            }

        }

        marker = marker + 1 ;

        return marker;
        
    }
}
