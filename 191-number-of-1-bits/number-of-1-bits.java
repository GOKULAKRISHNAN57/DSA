class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n >= 0){

            if(n == 1){
                count++;
                break;
            }
            
            int val = n % 2;
            count = (val == 1) ? count+val : count;
            n = n/2;
        }

        return count;
    }
}