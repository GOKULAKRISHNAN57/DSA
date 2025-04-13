class Solution {
    public int removeElement(int[] nums, int val) {
        Boolean check = false ;
        int marker = 0 ;

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] != val){

                nums[marker] = nums[i];
                
                marker = marker +1;

                check = false;

            }

            if(check = false){

                if(nums[i] == val){
                    marker = i-1 ;
                    check = true;
                }
            }
            
        }

        return marker;


    
    }
}