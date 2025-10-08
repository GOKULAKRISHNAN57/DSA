class Solution {
    public int removeElement(int[] nums, int val) {

        int marker = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != val){
                nums[marker] = nums[i];
                marker++;
            }

        }

        return marker;
    }
}