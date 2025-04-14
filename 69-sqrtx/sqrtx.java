class Solution {
    public int mySqrt(int x) {

        double squareroot = Math.sqrt(x);

        int round = (int) Math.floor(squareroot);
        return round;   
    }
}