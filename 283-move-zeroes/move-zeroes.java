class Solution {
    public void moveZeroes(int[] nums) {

        int placeholder=0;
        Boolean check = false;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0 && check == false){
                nums[placeholder] = nums[i];
                placeholder++;
            }

        }

        for(int i = placeholder ; i < nums.length ; i++){
            nums[i] = 0 ; 
        }
        
        
    }
}