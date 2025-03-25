class Solution {
    public int thirdMax(int[] nums) {
        int length = nums.length;


        for (int temp = 0; temp < length; temp++) {
            int large = temp;

            for (int i = temp; i < length; i++) {
                if (nums[large] < nums[i]) { 
                    large = i;
                }
            }

            int k = nums[temp];
            nums[temp] = nums[large];
            nums[large] = k;
        }

        int third_max = 0;
        int y = nums[0];

        for (int i = 1; i < length; i++) {
            if (y > nums[i]) { 
                y = nums[i];
                third_max++;

                if (third_max == 2) { 
                    return y;
                }
            }
        }

        return nums[0];
    }
}
