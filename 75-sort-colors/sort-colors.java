class Solution {
    public void sortColors(int[] nums) {

        int zero= 0;
        int one = 0;

        
        for(int i = 0 ; i < nums.length ; i ++ ){

            if(nums[i] == 0){
                zero++;

            }

            if(nums[i] == 1){
                one++;

            }
        }

        for(int j = 0 ; j < nums.length ; j++ ){

            if(zero > 0){
                nums[j] = 0 ;
                zero--;

            }

            else if(one > 0){
                nums[j] = 1 ;
                one--;

            }

            else{
                nums[j] = 2 ;
            }
            
        }
    }
}