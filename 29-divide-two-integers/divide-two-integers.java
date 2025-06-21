class Solution {
    public int divide(int dividend, int divisor) {

        double value = dividend/divisor;

        int result = (int)value;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }

        return result;
        
    }
}