class Solution {
    public int[] sortArrayByParity(int[] nums) {   
        
        int newarr[] = new int[nums.length];

        int marker = 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            if( nums[i] % 2 == 0){
                newarr[marker] = nums[i];
                marker++;
            }
        }

        for(int j = 0; j < newarr.length ; j++){
            if( nums[j] % 2 != 0){
                newarr[marker] = nums[j];
                marker++;
            }
        }

        return newarr;

    }
}