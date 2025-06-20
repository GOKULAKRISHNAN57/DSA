class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int newarr[] = new int[nums.length];
        int marker_even = 0;
        int marker_odd = 1;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                newarr[marker_even] = nums[i];
                marker_even += 2;
            }

            else{
                newarr[marker_odd] = nums[i];
                marker_odd += 2;
            }
        }

        return newarr;
    }
}