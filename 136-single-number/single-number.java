class Solution {
    public int singleNumber(int[] nums) {

        int l = nums.length;
        int check = 0;
        int single=0;

        for(int i = 0 ; i < l ; i++){

            for(int j = 0 ; j < l ; j++){
                
                if(nums[i] == nums[j]){
                    check++;
                }

            }
            if(check == 1){
                single =  nums[i];
            }
            check = 0;
        }

        return single;
        
    }
}